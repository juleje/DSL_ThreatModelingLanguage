package xtext.generator.backend.domain;

import java.util.List;

public class Boundary extends Element{
	public List<Entity> entities;

	public Boundary(String id, String name, String description, List<Entity> entities) {
		super(id, name,description);
		this.entities = entities;
	}

	public boolean contains(Entity entity) {
		for(Entity e:entities) {
			if(e.name.equals(entity.name)) {
				return true;
			}
		}
		return false;
	}

	 public boolean containsAll(Boundary other) {
	        return this.entities.containsAll(other.entities);
	    }
	
}
