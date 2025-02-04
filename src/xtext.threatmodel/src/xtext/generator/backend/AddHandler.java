package xtext.generator.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import xtext.generator.backend.domain.Boundary;
import xtext.generator.backend.domain.Datastore;
import xtext.generator.backend.domain.Element;
import xtext.generator.backend.domain.Entity;
import xtext.generator.backend.domain.ExternalEntity;
import xtext.generator.backend.domain.Flow;
import xtext.generator.backend.domain.Process;
import xtext.generator.backend.exceptions.OverlappingBoundaryElementsException;
import xtext.threatModelLanguage.Add;
import xtext.threatModelLanguage.AddBoundary;
import xtext.threatModelLanguage.AddDatastore;
import xtext.threatModelLanguage.AddEntity;
import xtext.threatModelLanguage.AddExternal;
import xtext.threatModelLanguage.AddFlow;
import xtext.threatModelLanguage.AddProcess;

public class AddHandler {
	Validator validator = new Validator();
	
	//Add
		public Element handleAdd(List<Element> elements, Add add) throws Exception {
			
			if(add instanceof AddProcess){
				return new Process(add.getId(),add.getName(),add.getDescription());
	    	}
	    	if(add instanceof AddExternal){
				return new ExternalEntity(add.getId(),add.getName(),add.getDescription());
	    	}
	    	if(add instanceof AddDatastore){
				return new Datastore(add.getId(),add.getName(),add.getDescription());
	    	}
	    	if(add instanceof AddFlow){
	    		AddFlow addFlow = (AddFlow ) add;;
	    		Entity source = getEntityById(elements, addFlow.getSourceId() );
	    		Entity destination = getEntityById(elements, addFlow.getDestinationId());
				return new Flow(addFlow.getId(),addFlow.getName(),  addFlow.getDescription(),source,destination);
	    	}
	    	if(add instanceof AddBoundary){
	    		AddBoundary addBoundary = (AddBoundary ) add;
	    		List<Entity> entities = new ArrayList<>();
	    		for(String entity: addBoundary.getEntities()){
	    			entities.add(getEntityById(elements, entity));
	    		}
	    		//validator.checkOverlappingBoundaryElements(elements, addBoundary.getName(), entities);
				return new Boundary(addBoundary.getId(), addBoundary.getName(), addBoundary.getDescription(), entities);
	    	}
			return null;
		}

		private Entity getEntityById(List<Element> elements, String elementId) {
			for(Element e: elements) {
				if(e.id.equals(elementId)) {
					return (Entity) e;
				}
			}
			throw new NoSuchElementException("There is no element to with id: "+elementId);
		}
}
