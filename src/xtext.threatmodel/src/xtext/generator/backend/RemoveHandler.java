package xtext.generator.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import xtext.generator.backend.domain.Boundary;
import xtext.generator.backend.domain.Element;
import xtext.generator.backend.domain.Entity;
import xtext.generator.backend.domain.Flow;
import xtext.threatModelLanguage.Remove;

public class RemoveHandler {

	//Remove
		public List<Element> handleRemove(List<Element> elements, Remove remove) {
			
			if(elements.stream().allMatch(e -> !e.id.equals(remove.getId()))) {
				throw new NoSuchElementException("There is no element to delete with id: "+remove.getId());
			}
			
			List<Element> newElements = new ArrayList<>();
			for(Element e: elements) {
				if(!e.id.equals(remove.getId())){
					newElements.add(e);
				}
			}
			newElements = handleDeleteFromBoundary(newElements,remove.getId());
			return handleCascadingDeleteFlow(newElements,remove.getId());
			

		}

		private List<Element> handleCascadingDeleteFlow(List<Element> elements, String removeElementId) {
			List<Element> newElements = new ArrayList<>();
			for(Element e: elements) {
				if(e instanceof Flow) {
					Flow f = (Flow) e;
					if(!f.destination.id.equals(removeElementId)&&!f.source.id.equals(removeElementId)) {
						newElements.add(f);
					}
				}else {
					newElements.add(e);
				}
			}
			return newElements;
		}
		
		private List<Element> handleDeleteFromBoundary(List<Element> elements, String removeElementId) {
			for(Element e: elements) {
				if(e instanceof Boundary) {
					Boundary b = (Boundary) e;
					List<Entity> newElements = new ArrayList<>();
					for(Element be: b.entities) {
						if(!be.id.equals(removeElementId)) {
							newElements.add((Entity) be);
						}
					}
					b.entities = newElements;
				}
			}
			return elements;
		}
}
