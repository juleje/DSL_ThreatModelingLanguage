package xtext.generator.backend;

import java.util.List;
import java.util.NoSuchElementException;

import xtext.generator.backend.domain.Boundary;
import xtext.generator.backend.domain.Element;
import xtext.generator.backend.domain.Entity;
import xtext.generator.backend.exceptions.DuplicatedIdException;
import xtext.generator.backend.exceptions.EntityAllreadyInBoundaryException;
import xtext.generator.backend.exceptions.OverlappingBoundaryElementsException;

public class Validator {

	public boolean checkDuplicatedIDs(List<Element> elements, String newElementId) throws DuplicatedIdException {
		for(Element e: elements) {
			if(e.id.equals(newElementId)) {
				throw new DuplicatedIdException("There is a statement that makes an element with a duplicated id: "+newElementId);
			}
		} 
		return true;
		
	}
	
	public boolean checkOverlappingBoundaryElements(List<Element> elements,String boundaryId,  List<Entity> boundaryelements) throws OverlappingBoundaryElementsException {
		for(Element e: elements) {
			if(e instanceof Boundary && !e.id.equals(boundaryId)) {
				Boundary boundary = (Boundary) e;
				if(!boundary.entities.stream().noneMatch(boundaryelements::contains)) {
					throw new OverlappingBoundaryElementsException("The boundaries "+ boundaryId + " and " + boundary.id + " have overlapping elements.");
				}
			}
		}
		return true;
	}
	
	public boolean checkEntityAllreadyInBoundary(List<Entity> elements,String newElementId) throws EntityAllreadyInBoundaryException {
		for(Element e: elements) {
			if(e.id.equals(newElementId)) {
				throw new EntityAllreadyInBoundaryException("The entity "+ newElementId + " is allready in the boundary.");
			}
		}
		return true;
	}

	public boolean isValidElementId(List<Element> elements, String id) {
		boolean isValid = false;
		for(Element e: elements) {
			if(e.id.equals(id)) {
				isValid = true;
			}
		} 
		if(!isValid) {
			throw new NoSuchElementException("There is no element to with id: "+id);
		}
		return true;
		
		
	}

	public void checkEntityNotInBoundary(List<Entity> entities, String oldEntityId) {
		boolean isInBoundary = false;
		for(Entity e: entities) {
			if(e.id.equals(oldEntityId)) {
				isInBoundary = true;
			}
		}
		if(!isInBoundary) {
			throw new NoSuchElementException("The entity to remove "+oldEntityId+" is not in the boundary.");
		}
	}
	
	
}
