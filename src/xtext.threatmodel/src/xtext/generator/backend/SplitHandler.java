package xtext.generator.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.eclipse.emf.common.util.EList;

import xtext.generator.backend.domain.*;
import xtext.generator.backend.domain.Process;
import xtext.threatModelLanguage.FlowFix;
import xtext.threatModelLanguage.Modify;
import xtext.threatModelLanguage.SplitDatastoreAndDatastore;
import xtext.threatModelLanguage.SplitDatastoreAndExternal;
import xtext.threatModelLanguage.SplitEntity;
import xtext.threatModelLanguage.SplitExternalAndDatastore;
import xtext.threatModelLanguage.SplitExternalAndExternal;
import xtext.threatModelLanguage.SplitExternalAndProcess;
import xtext.threatModelLanguage.SplitProcessAndExternal;
import xtext.threatModelLanguage.SplitProcessAndProcess;
import xtext.threatModelLanguage.SplitsDatastoreAndProcess;
import xtext.threatModelLanguage.SplitsProcessAndDatastore;

public class SplitHandler {
	private Validator validator = new Validator();
	
	public List<Element> handleSplitEntity(List<Element> elements, Modify statement) throws Exception {
		SplitEntity splitEnity = (SplitEntity) statement;
		
		if(splitEnity instanceof SplitProcessAndProcess) {
			SplitProcessAndProcess split = (SplitProcessAndProcess) splitEnity;
			return handleSplitProcessAndProcess(elements, split);
		}
		if(splitEnity instanceof SplitsProcessAndDatastore) {
			SplitsProcessAndDatastore split = (SplitsProcessAndDatastore) splitEnity;
			return handleSplitsProcessAndDatastore(elements, split);
		}
		if(splitEnity instanceof SplitsDatastoreAndProcess) {
			SplitsDatastoreAndProcess split = (SplitsDatastoreAndProcess) splitEnity;
			return handleSplitsDatastoreAndProcess(elements, split);
		}
		if(splitEnity instanceof SplitProcessAndExternal) {
			SplitProcessAndExternal split = (SplitProcessAndExternal) splitEnity;
			return handleSplitProcessAndExternal(elements, split);
		}
		if(splitEnity instanceof SplitExternalAndProcess) {
			SplitExternalAndProcess split = (SplitExternalAndProcess) splitEnity;
			return handleSplitExternalAndProcess(elements, split);
		}
		if(splitEnity instanceof SplitDatastoreAndExternal) {
			SplitDatastoreAndExternal split = (SplitDatastoreAndExternal) splitEnity;
			return handleSplitDatastoreAndExternal(elements, split);
		}
		if(splitEnity instanceof SplitExternalAndDatastore) {
			SplitExternalAndDatastore split = (SplitExternalAndDatastore) splitEnity;
			return handleSplitSplitExternalAndDatastore(elements, split);
		}
		if(splitEnity instanceof SplitDatastoreAndDatastore) {
			SplitDatastoreAndDatastore split = (SplitDatastoreAndDatastore) splitEnity;
			return handleSplitDatastoreAndDatastore(elements, split);
		}
		if(splitEnity instanceof SplitExternalAndExternal) {
			SplitExternalAndExternal split = (SplitExternalAndExternal) splitEnity;
			return handleSplitExternalAndExternal(elements, split);
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
	
	private List<Element> removeOldEntity(List<Element> elements, String id) {
		List<Element> noOldEntities = new ArrayList<>();
		for(Element e: elements) {
			if(!e.id.equals(id)){
				noOldEntities.add(e);
			}
		}
		return noOldEntities;
	}
	
	private List<Element> fixBoundaries(String id, List<Element> noOldEntities, Entity p1, Entity p2) {
		List<Element> fixedBoundaries = new ArrayList<>();
		for(Element e: noOldEntities) {
			 if(e instanceof Boundary) {
				 	//System.out.println("fixed");
					Boundary b = (Boundary)e;
					List<Entity> newElements = new ArrayList<>();
					for(Element be: b.entities) {
						if(!be.id.equals(id)) {
							newElements.add((Entity) be);
						}else {
							newElements.add(p1);
							newElements.add(p2);
						}
					}
					b.entities = newElements;
					fixedBoundaries.add(b);
			}else {
				fixedBoundaries.add(e);
			}
		}
		return fixedBoundaries;
	}
	
	private void fixFlows(String id, EList<FlowFix> flowfixList, List<Element> fixedBoundaries) throws Exception {
		int countFlowsToFix = 0;
		List<Flow> flowWithElementToSplit  = new ArrayList<>();
		for(Element e: fixedBoundaries) {
			if(e instanceof Flow ) {
				Flow f = (Flow) e;
				if(f.source.id.equals(id) || f.destination.id.equals(id)) {
					flowWithElementToSplit.add(f);
					countFlowsToFix++;
				}
			}
		}
		if(countFlowsToFix!=flowfixList.size()) {
			throw new Exception("The amount of flows to change is not the same as the amount of statements for choosing the new sourc/destinationof the flows");
		}
		for(FlowFix ff: flowfixList) {
			validator.isValidElementId(fixedBoundaries, ff.getFlowId());
			validator.isValidElementId(fixedBoundaries, ff.getEntityId());
			
			for(Element e: fixedBoundaries) {
				if(e instanceof Flow && e.id.equals(ff.getFlowId())) {
					Flow f = (Flow)e;
					if(f.source.id.equals(id)) {
						f.source = (Entity) getElementById(fixedBoundaries,ff.getEntityId());
						flowWithElementToSplit.remove(f);
					}
					if(f.destination.id.equals(id)) {
						f.destination = (Entity) getElementById(fixedBoundaries,ff.getEntityId());
						flowWithElementToSplit.remove(f);
					}
				}
			}
			
		}
		if(flowWithElementToSplit.size()!=0) {
			throw new Exception("The source/destination of flow "+ flowWithElementToSplit.get(0).id+ " has to be specified to one of the new entities created by the split.");
		}
	}
	
	private List<Element> handleSplitSplitExternalAndDatastore(List<Element> elements, SplitExternalAndDatastore split) throws Exception {
		validator.isValidElementId(elements,split.getId() );
		
		//Delete old entity
		List<Element> noOldEntities = removeOldEntity(elements, split.getId());
		
		//Make new entities
		validator.checkDuplicatedIDs(noOldEntities, split.getEntity1());
		ExternalEntity p1 = new ExternalEntity(split.getEntity1(), split.getEntity1Name(), split.getEntity1Description() );
		noOldEntities.add(p1);
		validator.checkDuplicatedIDs(noOldEntities, split.getEntity2());
		Datastore p2 = new Datastore(split.getEntity2(), split.getEntity2Name(), split.getEntity2Description() );
		noOldEntities.add(p2);
		
		//Fix boundary
		List<Element> fixedBoundaries = fixBoundaries(split.getId(), noOldEntities, p1, p2);
		
		//Fix flows
		fixFlows(split.getId(),split.getFlowFix(), fixedBoundaries);
		
		return fixedBoundaries;
	}


	private List<Element> handleSplitExternalAndProcess(List<Element> elements, SplitExternalAndProcess split) throws Exception {
		validator.isValidElementId(elements,split.getId() );
		
		//Delete old entity
		List<Element> noOldEntities = removeOldEntity(elements, split.getId());
		
		//Make new entities
		validator.checkDuplicatedIDs(noOldEntities, split.getEntity1());
		ExternalEntity p1 = new ExternalEntity(split.getEntity1(), split.getEntity1Name(), split.getEntity1Description() );
		noOldEntities.add(p1);
		validator.checkDuplicatedIDs(noOldEntities, split.getEntity2());
		Process p2 = new Process(split.getEntity2(), split.getEntity2Name(), split.getEntity2Description() );
		noOldEntities.add(p2);
		
		//Fix boundary
				List<Element> fixedBoundaries = fixBoundaries(split.getId(), noOldEntities, p1, p2);
				
		//Fix flows
		fixFlows(split.getId(),split.getFlowFix(), fixedBoundaries);
						
		return fixedBoundaries;
	}

	private List<Element> handleSplitsDatastoreAndProcess(List<Element> elements, SplitsDatastoreAndProcess split) throws Exception {
		validator.isValidElementId(elements,split.getId() );
		
		//Delete old entity
		List<Element> noOldEntities = removeOldEntity(elements, split.getId());
		
		//Make new entities
		validator.checkDuplicatedIDs(noOldEntities, split.getEntity1());
		Datastore p1 = new Datastore(split.getEntity1(), split.getEntity1Name(), split.getEntity1Description() );
		noOldEntities.add(p1);
		validator.checkDuplicatedIDs(noOldEntities, split.getEntity2());
		Process p2 = new Process(split.getEntity2(), split.getEntity2Name(), split.getEntity2Description() );
		noOldEntities.add(p2);
		
		//Fix boundary
				List<Element> fixedBoundaries = fixBoundaries(split.getId(), noOldEntities, p1, p2);
				
		//Fix flows
		fixFlows(split.getId(),split.getFlowFix(), fixedBoundaries);
						
		return fixedBoundaries;
	}

	private List<Element> handleSplitExternalAndExternal(List<Element> elements, SplitExternalAndExternal split) throws Exception {
		validator.isValidElementId(elements,split.getId() );
		
		//Delete old entity
		List<Element> noOldEntities = removeOldEntity(elements, split.getId());
		
		//Make new entities
		validator.checkDuplicatedIDs(noOldEntities, split.getEntity1());
		ExternalEntity p1 = new ExternalEntity(split.getEntity1(), split.getEntity1Name(), split.getEntity1Description() );
		noOldEntities.add(p1);
		validator.checkDuplicatedIDs(noOldEntities, split.getEntity2());
		ExternalEntity p2 = new ExternalEntity(split.getEntity2(), split.getEntity2Name(), split.getEntity2Description() );
		noOldEntities.add(p2);
		
		//Fix boundary
				List<Element> fixedBoundaries = fixBoundaries(split.getId(), noOldEntities, p1, p2);
				
		//Fix flows
		fixFlows(split.getId(),split.getFlowFix(), fixedBoundaries);
						
		return fixedBoundaries;
	}

	private List<Element> handleSplitDatastoreAndDatastore(List<Element> elements, SplitDatastoreAndDatastore split) throws Exception {
		validator.isValidElementId(elements,split.getId() );
		
		//Delete old entity
		List<Element> noOldEntities = removeOldEntity(elements, split.getId());
		
		//Make new entities
		validator.checkDuplicatedIDs(noOldEntities, split.getEntity1());
		Datastore p1 = new Datastore(split.getEntity1(), split.getEntity1Name(), split.getEntity1Description() );
		noOldEntities.add(p1);
		validator.checkDuplicatedIDs(noOldEntities, split.getEntity2());
		Datastore p2 = new Datastore(split.getEntity2(), split.getEntity2Name(), split.getEntity2Description() );
		noOldEntities.add(p2);
		
		//Fix boundary
		List<Element> fixedBoundaries = fixBoundaries(split.getId(), noOldEntities, p1, p2);
				
		//Fix flows
		fixFlows(split.getId(),split.getFlowFix(), fixedBoundaries);
						
		return fixedBoundaries;
	}

	private List<Element> handleSplitDatastoreAndExternal(List<Element> elements, SplitDatastoreAndExternal split) throws Exception {
		validator.isValidElementId(elements,split.getId() );
		
		//Delete old entity
		List<Element> noOldEntities = removeOldEntity(elements, split.getId());
		
		//Make new entities
		validator.checkDuplicatedIDs(noOldEntities, split.getEntity1());
		Datastore p1 = new Datastore(split.getEntity1(), split.getEntity1Name(), split.getEntity1Description() );
		noOldEntities.add(p1);
		validator.checkDuplicatedIDs(noOldEntities, split.getEntity2());
		ExternalEntity p2 = new ExternalEntity(split.getEntity2(), split.getEntity2Name(), split.getEntity2Description() );
		noOldEntities.add(p2);
		
		//Fix boundary
		List<Element> fixedBoundaries = fixBoundaries(split.getId(), noOldEntities, p1, p2);
				
		//Fix flows
		fixFlows(split.getId(),split.getFlowFix(), fixedBoundaries);
						
		return fixedBoundaries;
	}

	private List<Element> handleSplitProcessAndExternal(List<Element> elements, SplitProcessAndExternal split) throws Exception {
		validator.isValidElementId(elements,split.getId() );
		
		//Delete old entity
		List<Element> noOldEntities = removeOldEntity(elements, split.getId());
		
		//Make new entities
		validator.checkDuplicatedIDs(noOldEntities, split.getEntity1());
		Process p1 = new Process(split.getEntity1(), split.getEntity1Name(), split.getEntity1Description() );
		noOldEntities.add(p1);
		validator.checkDuplicatedIDs(noOldEntities, split.getEntity2());
		ExternalEntity p2 = new ExternalEntity(split.getEntity2(), split.getEntity2Name(), split.getEntity2Description() );
		noOldEntities.add(p2);
		
		//Fix boundary
		List<Element> fixedBoundaries = fixBoundaries(split.getId(), noOldEntities, p1, p2);
				
		//Fix flows
		fixFlows(split.getId(),split.getFlowFix(), fixedBoundaries);
						
		return fixedBoundaries;
	}

	private List<Element> handleSplitsProcessAndDatastore(List<Element> elements, SplitsProcessAndDatastore split) throws Exception {
		validator.isValidElementId(elements,split.getId() );
		
		//Delete old entity
		List<Element> noOldEntities = removeOldEntity(elements, split.getId());
		
		//Make new entities
		validator.checkDuplicatedIDs(noOldEntities, split.getEntity1());
		Process p1 = new Process(split.getEntity1(), split.getEntity1Name(), split.getEntity1Description() );
		noOldEntities.add(p1);
		validator.checkDuplicatedIDs(noOldEntities, split.getEntity2());
		Datastore p2 = new Datastore(split.getEntity2(), split.getEntity2Name(), split.getEntity2Description() );
		noOldEntities.add(p2);
		
		//Fix boundary
		List<Element> fixedBoundaries = fixBoundaries(split.getId(), noOldEntities, p1, p2);
				
		//Fix flows
		fixFlows(split.getId(),split.getFlowFix(), fixedBoundaries);
						
		return fixedBoundaries;
		
	}

	private List<Element> handleSplitProcessAndProcess(List<Element> elements, SplitProcessAndProcess split) throws Exception{
validator.isValidElementId(elements,split.getId() );
		
		//Delete old entity
		List<Element> noOldEntities = removeOldEntity(elements, split.getId());
		
		//Make new entities
		validator.checkDuplicatedIDs(noOldEntities, split.getEntity1());
		Process p1 = new Process(split.getEntity1(), split.getEntity1Name(), split.getEntity1Description() );
		noOldEntities.add(p1);
		validator.checkDuplicatedIDs(noOldEntities, split.getEntity2());
		Process p2 = new Process(split.getEntity2(), split.getEntity2Name(), split.getEntity2Description() );
		noOldEntities.add(p2);
		
		//Fix boundary
		List<Element> fixedBoundaries = fixBoundaries(split.getId(), noOldEntities, p1, p2);
				
		//Fix flows
		fixFlows(split.getId(),split.getFlowFix(), fixedBoundaries);
						
		return fixedBoundaries;
	}
	

}
