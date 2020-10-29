/**
 * 
 */
package de.rayschpp.model;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author raynhold
 *
 */
public class Vertices extends HashSet<Vertex> {

	public Vertices(Vertex... vertexs) {
		for (Vertex vertex : vertexs) {
			this.add(vertex);
		}
		
	}
	
	public Vertices(Collection<Vertex> collection) {
		this.addAll(collection);
	}
}
