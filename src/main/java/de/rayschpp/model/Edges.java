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
public class Edges extends HashSet<Edge> {

	public Edges(Edge... edges) {
		for (Edge edge : edges) {
			this.add(edge);
		}
	}

	/**
	 * @param edges
	 */
	public Edges(Collection<Edge> edges) {
		this.addAll(edges);
	}
}
