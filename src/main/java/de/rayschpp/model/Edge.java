/**
 * 
 */
package de.rayschpp.model;

/**
 * @author raynhold
 *
 */
public class Edge {

	private final Vertex tail;
	private final Vertex head;
	
	public Edge(Vertex tail, Vertex head) {
		this.tail = tail;
		this.head = head;
	}

	public Vertex getTail() {
		return tail;
	}

	public Vertex getHead() {
		return head;
	}
}
