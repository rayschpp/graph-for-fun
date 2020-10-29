/**
 * 
 */
package de.rayschpp.representation;

import java.util.HashMap;
import java.util.stream.Collectors;

import de.rayschpp.model.DirectedGraph;
import de.rayschpp.model.Edge;
import de.rayschpp.model.Edges;
import de.rayschpp.model.Vertex;
import de.rayschpp.model.Vertices;

/**
 * @author raynhold
 *
 */
public class AdjacencyMap extends HashMap<Vertex, Vertices> {

	/**
	 * 
	 */
	public AdjacencyMap(String string) {
		throw new NullPointerException();
	}
	
	public Vertices getHeads(Vertex tail) {
		return super.get(tail);
	}
	
	/**
	 * 
	 */
	public AdjacencyMap(DirectedGraph directedGraph) {
		for (Vertex vertex : directedGraph.getVertices()) {
			Vertices heads = new Vertices();
			for (Edge edge : directedGraph.getEdges().parallelStream().filter(e -> e.getTail().equals(vertex))
					.collect(Collectors.toSet())) {
				heads.add(edge.getHead());
			}
			super.put(vertex, heads);
		}
	}

	@Override
	public String toString() {
		if (this.keySet().isEmpty()) {
			return "";
		}
		return this.keySet().stream().map(vertex -> vertex + ": " + this.get(vertex).toString())
				.collect(Collectors.joining("\n")) + "\n";
	}

	/**
	 * @return
	 */
	public Vertices getTails() {
		return new Vertices(this.keySet());
	}

	/**
	 * @return
	 */
	public Edges getEdges() {
		Edges edges = new Edges();
		for (Vertex tail : this.getTails()) {
			for (Vertex head: this.getHeads(tail)) {
				edges.add(new Edge(tail, head));
			}
		}
		return edges;
	}
	
}
