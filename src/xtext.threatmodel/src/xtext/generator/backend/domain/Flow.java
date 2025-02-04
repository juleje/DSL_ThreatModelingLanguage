package xtext.generator.backend.domain;

public class Flow extends Element{
	public Entity source;
	public Entity destination;
	

	public Flow(String id, String name, String description, Entity source, Entity destination) {
		super(id, name, description);
		this.source = source;
		this.destination = destination;
	}
	
}
