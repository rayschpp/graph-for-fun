/**
 * 
 */
package de.rayschpp.model;

import java.util.Set;

import de.rayschpp.representation.AdjacencyMap;

/**
 * @author raynhold
 *
 */
public class DirectedGraph {

	private Vertices vertices;
	private Edges edges;

	public DirectedGraph() {
		this(new Vertices(), new Edges());
	}

	public DirectedGraph(Vertices vertices, Edges edges) {
		setVertices(vertices);
		setEdges(edges);
	}
	
	public DirectedGraph(AdjacencyMap adjacencyMap) {
		setVertices(adjacencyMap.getTails());
		setEdges(adjacencyMap.getEdges());
	}

	/**
	 * @param vertices2
	 * @param edges2
	 */
	@Deprecated
	public DirectedGraph(Set<Vertex> vertices, Set<Edge> edges2) {
		setVertices(new Vertices(vertices));
		setEdges(new Edges(edges));
	}

	/**
	 * @return the vertices
	 */
	public Vertices getVertices() {
		return vertices;
	}

	/**
	 * @param vertices the vertices to set
	 */
	public void setVertices(Vertices vertices) {
		this.vertices = vertices;
	}

	/**
	 * @return the edges
	 */
	public Edges getEdges() {
		return edges;
	}

	/**
	 * @param edges the edges to set
	 */
	public void setEdges(Edges edges) {
		this.edges = edges;
	}

	public void printAdjacencyList() {
		System.out.println("DirectedGraph {");
		System.out.println("V: " + getVertices());
		System.out.print(new AdjacencyMap(this).toString());
		System.out.println("}");
	}

	public Vertices pre(Vertex v) {
		Vertices tails = new Vertices();
		AdjacencyMap adjacencyMap = new AdjacencyMap(this);
		for (Vertex tail : adjacencyMap.keySet()) {
			if (adjacencyMap.getHeads(tail).contains(v)) {
				tails.add(tail);
			}
		}
		return tails;
	}

	public Vertices post(Vertex v) {
		return new AdjacencyMap(this).get(v);
	}
}
