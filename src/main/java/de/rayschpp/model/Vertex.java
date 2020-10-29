/**
 * 
 */
package de.rayschpp.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author raynhold
 * @param <Type>
 *
 */
public class Vertex<Type> {
	
	private final Type id;

	public Type getId() {
		return id;
	}
	
	public Vertex(Type id) {
		this.id = id;
	}
	
	
	
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
		Vertex other = (Vertex) obj;
		return Objects.equals(id, other.id);
	}

	public static Set<Vertex> convertSetOfGenericToSetOfVertex(Set<Object> list) {
		Set<Vertex> v = new HashSet<>();
 		for (Object element : list) {
			v.add(new Vertex<Object>(element));
		}
 		return v;
	}
	
	@Override
	public String toString() {
		return String.valueOf(getId());
	}
}
