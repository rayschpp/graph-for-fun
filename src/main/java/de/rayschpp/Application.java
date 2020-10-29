/**
 * 
 */
package de.rayschpp;

import de.rayschpp.model.DirectedGraph;
import de.rayschpp.model.Edge;
import de.rayschpp.model.Edges;
import de.rayschpp.model.Vertex;
import de.rayschpp.model.Vertices;

/**
 * @author raynhold
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vertex v1 = new Vertex('a');
		Vertex v2 = new Vertex('b');
		Vertex v3 = new Vertex('c');
		Vertex v4 = new Vertex('d');
		Vertex v5 = new Vertex('e');
		Vertex v6 = new Vertex('f');
		Vertex v7 = new Vertex('g');
		Vertex v8 = new Vertex('h');
		Vertex v9 = new Vertex('i');
		Vertex v10 = new Vertex('j');
		Vertex v11 = new Vertex('k');
		Vertices vertices = new Vertices(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11);
		
		Edges edges = new Edges(new Edge(v1, v2), // a -> b
				new Edge(v1, v4), // a -> c
				new Edge(v2, v3), // b -> c
				new Edge(v2, v4), // b -> d
				new Edge(v3, v6), // c -> f
				new Edge(v3, v7), // c -> g
				new Edge(v4, v7), // d -> g
				new Edge(v4, v11), // d -> k
				new Edge(v5, v3), // e -> c
				new Edge(v5, v6), // e -> f
				new Edge(v6, v7), // f -> g
				new Edge(v6, v10), // f -> j
				new Edge(v7, v9), // g -> i
				new Edge(v8, v7), // h -> g
				new Edge(v9, v11), // i -> k
				new Edge(v10, v11)// j -> k
		);
		DirectedGraph G = new DirectedGraph(vertices, edges);
		G.printAdjacencyList();

	}

}
