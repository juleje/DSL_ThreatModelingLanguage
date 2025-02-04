package xtext.generator.backend.domain;

import java.util.Objects;

public class Element {
	
	public Element(String id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public String id;
	public String name;
	public String description;

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Element other = (Element) obj;
		return Objects.equals(id, other.id);
	}
}
