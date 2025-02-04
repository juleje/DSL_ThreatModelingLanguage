package xtext.generator.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

import xtext.generator.backend.domain.Boundary;
import xtext.generator.backend.domain.Datastore;
import xtext.generator.backend.domain.Element;
import xtext.generator.backend.domain.Entity;
import xtext.generator.backend.domain.ExternalEntity;
import xtext.generator.backend.domain.Flow;
import xtext.generator.backend.domain.Process;
import xtext.generator.backend.exceptions.DuplicatedIdException;
import xtext.generator.backend.exceptions.FlowSameSourceAndDestinationException;
import xtext.generator.backend.exceptions.OverlappingBoundaryElementsException;
import xtext.threatModelLanguage.Add;
import xtext.threatModelLanguage.AddBoundary;
import xtext.threatModelLanguage.AddDatastore;
import xtext.threatModelLanguage.AddEntity;
import xtext.threatModelLanguage.AddExternal;
import xtext.threatModelLanguage.AddFlow;
import xtext.threatModelLanguage.AddProcess;
import xtext.threatModelLanguage.BoundaryAddEntity;
import xtext.threatModelLanguage.BoundaryRemoveEntity;
import xtext.threatModelLanguage.ChangeDescription;
import xtext.threatModelLanguage.FlowDestination;
import xtext.threatModelLanguage.FlowFix;
import xtext.threatModelLanguage.FlowSource;
import xtext.threatModelLanguage.MergeEntity;
import xtext.threatModelLanguage.MergeIntoDatastore;
import xtext.threatModelLanguage.MergeIntoExternal;
import xtext.threatModelLanguage.MergeIntoProcess;
import xtext.threatModelLanguage.Modify;
import xtext.threatModelLanguage.ReID;
import xtext.threatModelLanguage.Rename;
import xtext.threatModelLanguage.RotateFlow;
import xtext.threatModelLanguage.SplitEntity;
import xtext.threatModelLanguage.SplitProcessAndProcess;

public class ModifyHandler {
	private Validator validator = new Validator();

	
	public List<Element> handleModify(List<Element> elements, Modify statement) throws Exception{
		
		if(statement instanceof Rename) {
			return handleRename(elements, statement);
		}
		if(statement instanceof ReID) {
			return handleIdChange(elements, statement);
		}
		if(statement instanceof ChangeDescription) {
			return handleFlowDescriptionChange(elements,statement);
		}
		if(statement instanceof FlowSource) {
			return handleFlowSourceChange(elements,statement);
		}
		if(statement instanceof FlowDestination) {
			return handleFlowDestinationChange(elements,statement);
		}
		if(statement instanceof BoundaryAddEntity) {
			return handleAddNewEntityToBundary(elements,statement);
		}
		if(statement instanceof BoundaryRemoveEntity) {
			return handleRemoveEntityFromBoundary(elements,statement);
		}
		if(statement instanceof RotateFlow) {
			return handleRotateFlow(elements,statement);
		}
		if(statement instanceof MergeEntity) {
			return handleMergeEntity(elements,statement);
		}
		if(statement instanceof SplitEntity) {
			SplitHandler split = new SplitHandler();
			return split.handleSplitEntity(elements,statement);
		}
		return elements;
	}
	
	private Element getElementById(List<Element> elements, String elementId) {
		for(Element e: elements) {
			if(e.id.equals(elementId)) {
				return e;
			}
		}
		throw new NoSuchElementException("There is no element to with id: "+elementId);
	}

	private List<Element> handleMergeEntity(List<Element> elements, Modify statement) throws Exception {
		MergeEntity mergeEntity = (MergeEntity) statement;	
		
		
		validator.isValidElementId(elements,mergeEntity.getEntity1());
		validator.isValidElementId(elements,mergeEntity.getEntity2());
		
		//Delete old entities
		List<Element> noOldEntities = new ArrayList<>();
		for(Element e: elements) {
			if(!(e.id.equals(mergeEntity.getEntity1())||e.id.equals(mergeEntity.getEntity2()))){
				noOldEntities.add(e);
			}
		}
				
		//Delete flow between entities
		List<Element> noLinkingFlows = new ArrayList<>();
		for(Element e: noOldEntities) {
			if(e instanceof Flow) {
				Flow f = (Flow) e;
				if(
						!((f.destination.id.equals(mergeEntity.getEntity1())&&f.source.id.equals(mergeEntity.getEntity2()))||
						(f.destination.id.equals(mergeEntity.getEntity2())&&f.source.id.equals(mergeEntity.getEntity1())))
				) {
					noLinkingFlows.add(f);
				}
			}else {
				noLinkingFlows.add(e);
			}
		}
		
		//Create new element
		validator.checkDuplicatedIDs(noLinkingFlows, mergeEntity.getId());
		Element newElement = null;
		if(mergeEntity instanceof MergeIntoProcess) {
			newElement = new Process(mergeEntity.getId() ,mergeEntity.getName(), mergeEntity.getDescription());
		}
		if(mergeEntity instanceof MergeIntoDatastore) {
			newElement = new Datastore(mergeEntity.getId() ,mergeEntity.getName(), mergeEntity.getDescription());
		}
		if(mergeEntity instanceof MergeIntoExternal) {
			newElement = new ExternalEntity(mergeEntity.getId() ,mergeEntity.getName(), mergeEntity.getDescription());
		}
		noLinkingFlows.add(newElement);
		
		//Fix boundary
		List<Element> fixedBoundaries = new ArrayList<>();
		for(Element e: noLinkingFlows) {
			 if(e instanceof Boundary) {
					Boundary b = (Boundary)e;
					List<Entity> newElements = new ArrayList<>();
					for(Element be: b.entities) {
						if(!be.id.equals(mergeEntity.getEntity1())&&!be.id.equals(mergeEntity.getEntity2())) {
							newElements.add((Entity) be);
						}
						
						/*
						 else {
						 
							if(be.name.equals(mergeEntity.getEntity2())) {//Get the boundary from the seccond entity
								newElements.add((Entity)newElement);
							}
						}*/
					}
					b.entities = newElements;
					fixedBoundaries.add(e);
			}else {
				fixedBoundaries.add(e);
			}
		}
				
		//Fix flows
		List<Element> newElements = new ArrayList<>();
		for(Element e: fixedBoundaries) {
			if(e instanceof Flow) {
				Flow f = (Flow) e;
				if(
						f.source.id.equals(mergeEntity.getEntity1())||
						f.source.id.equals(mergeEntity.getEntity2())
				){
					f.source = (Entity) newElement;
				}
				if(
						f.destination.id.equals(mergeEntity.getEntity2())||
						f.destination.id.equals(mergeEntity.getEntity1())
				){
					f.destination = (Entity) newElement;
				}
				newElements.add(f);
			}else {
				newElements.add(e);
			}
		}
		
		return newElements;
	}
	
	private List<Element> handleRotateFlow(List<Element> elements, Modify statement) {
		RotateFlow rotateFlow = (RotateFlow) statement;
		
		validator.isValidElementId(elements,rotateFlow.getId());
		
		for(Element e: elements) {
			if(e.id.equals(rotateFlow.getId())) {
				Flow f = (Flow)e;
				Entity entity = f.source;
				f.source = f .destination;
				f.destination = entity;
			}
		}
		return elements;
	}

	private List<Element> handleRemoveEntityFromBoundary(List<Element> elements, Modify statement) throws Exception {
		BoundaryRemoveEntity boundaryRemoveEntity = (BoundaryRemoveEntity) statement;
		
		validator.isValidElementId(elements,boundaryRemoveEntity.getId());
		validator.isValidElementId(elements,boundaryRemoveEntity.getOldEntity());
		
		List<Element> newElements = new ArrayList<>();
		for(Element e: elements) {
			if(e.id.equals(boundaryRemoveEntity.getId())) {
				Boundary b = (Boundary) e;
				validator.checkEntityNotInBoundary(b.entities, boundaryRemoveEntity.getOldEntity());
				List<Entity> newEntities =  b.entities.stream().filter(entity -> !entity.id.equals(boundaryRemoveEntity.getOldEntity())).toList();
				b.entities = newEntities;
				newElements.add(b);
			}else {
				newElements.add(e);
			}
		}
		return newElements;
	}

	private List<Element> handleAddNewEntityToBundary(List<Element> elements, Modify statement) throws Exception {
		BoundaryAddEntity boundaryAddEntity = (BoundaryAddEntity) statement;
		
		validator.isValidElementId(elements,boundaryAddEntity.getId());
		validator.isValidElementId(elements,boundaryAddEntity.getNewEntity());
		
		List<Element> newElements = new ArrayList<>();
		for(Element e: elements) {
			if(e.id.equals(boundaryAddEntity.getId())) {
				Boundary b = (Boundary)e;
				validator.checkEntityAllreadyInBoundary(b.entities, boundaryAddEntity.getNewEntity());
				b.entities.add((Entity) getElementById(elements,boundaryAddEntity.getNewEntity()));
				//validator.checkOverlappingBoundaryElements(elements, b.name, b.entities);
				newElements.add(b);
			}else {
				newElements.add(e);
			}
		}
		return newElements;
	}

	private List<Element> handleFlowDestinationChange(List<Element> elements, Modify statement) throws FlowSameSourceAndDestinationException {
		FlowDestination flowDestination = (FlowDestination) statement;
		
		validator.isValidElementId(elements,flowDestination.getId());
		validator.isValidElementId(elements,flowDestination.getDestination());
		
		List<Element> newElements = new ArrayList<>();
		for(Element e: elements) {
			if(e.id.equals(flowDestination.getId())) {
				Flow f = (Flow)e;
				f.destination = (Entity) getElementById(elements,flowDestination.getDestination());
				if(f.source.equals(f.destination)) {
					throw new FlowSameSourceAndDestinationException("When changing the the destination of "+f.id+", the statement will cause the source and destination to be the same.");
				}
				newElements.add(f);
			}else {
				newElements.add(e);
			}
		}
		return newElements;
	}

	private List<Element> handleFlowSourceChange(List<Element> elements, Modify statement) throws Exception {
		FlowSource flowSource = (FlowSource) statement;
		
		validator.isValidElementId(elements,flowSource.getId());
		validator.isValidElementId(elements,flowSource.getSource());

		List<Element> newElements = new ArrayList<>();
		for(Element e: elements) {
			if(e.id.equals(flowSource.getId())) {
				Flow f = (Flow)e;
				f.source = (Entity) getElementById(elements,flowSource.getSource());
			
				if(f.source.equals(f.destination)) {
					throw new FlowSameSourceAndDestinationException("When changing the the source of "+f.id+", the statement will cause the source and destination to be the same.");
				}
				
				newElements.add(f);
			}else {
				newElements.add(e);
			}
		}
		return newElements;
	}

	private List<Element> handleFlowDescriptionChange(List<Element> elements, Modify statement) {
		ChangeDescription flowDescription = (ChangeDescription) statement;
		
		validator.isValidElementId(elements,flowDescription.getId());
		
		List<Element> newElements = new ArrayList<>();
		for(Element e: elements) {
			if(e.id.equals(flowDescription.getId())) {
				e.description = flowDescription.getDescription();
				newElements.add(e);
			}else {
				newElements.add(e);
			}
		}
		return newElements;
	}
	
	private List<Element> handleIdChange(List<Element> elements, Modify statement) throws Exception {
		ReID renameIdElement =(ReID)statement;

		validator.isValidElementId(elements,renameIdElement.getId());
		validator.checkDuplicatedIDs(elements, renameIdElement.getNewId() );
		
		for(Element e: elements) {
			if(e.id.equals(renameIdElement.getId())) {
				e.id=renameIdElement.getNewId();
			}
			if(e instanceof Flow) {
				Flow f = (Flow) e;
				if(f.source.id.equals(renameIdElement.getId())) {
					f.source.id = renameIdElement.getNewId();
				}
				if(f.destination.id.equals(renameIdElement.getId())) {
					f.destination.id = renameIdElement.getNewId();
				}
			}
			if(e instanceof Boundary) {
				Boundary b = (Boundary)e;
				for(Element boundaryElement: b.entities) {
					if(boundaryElement.id.equals(renameIdElement.getId())) {
						boundaryElement.id = renameIdElement.getNewId();
					}
				}
			}
		}
		
		return elements;
	}


	private List<Element> handleRename(List<Element> elements, Modify statement) throws Exception {
		Rename renameElement =(Rename)statement;

		validator.isValidElementId(elements,renameElement.getId());
		
		for(Element e: elements) {
			if(e.id.equals(renameElement.getId())) {
				e.name=renameElement.getNewName();
			}
		}
		
		return elements;
	}
	

}
