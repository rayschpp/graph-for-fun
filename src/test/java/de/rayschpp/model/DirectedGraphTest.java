/**
 * 
 */
package de.rayschpp.model;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author raynhold
 *
 */
class DirectedGraphTest {
	
	private final PrintStream STANDARD_OUT = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	public void tearDown() throws Exception {
	    System.setOut(STANDARD_OUT);
	}

	/**
	 * Test method for {@link de.rayschpp.model.DirectedGraph#printAdjacencyList()}.
	 */
	@Test
	public void testPrintAdjacencyListWithEmptyGraph() throws Exception {
		DirectedGraph g = new DirectedGraph();
		g.printAdjacencyList();
		assertEquals("DirectedGraph {\nV: []\n}\n", outputStreamCaptor.toString(), "Output is not correct");
	}
	
	@Test
	public void testPrintAdjacencyListWithLoop() throws Exception {
		Vertex v1 = new Vertex('a');
		Edge e = new Edge(v1, v1);
		Set<Vertex> vertices = new HashSet<>();
		Set<Edge> edges = new HashSet<>();
		vertices.add(v1);
		edges.add(e);
		DirectedGraph directedGraph = new DirectedGraph(vertices, edges);
		directedGraph.printAdjacencyList();
		assertEquals("DirectedGraph {\nV: [a]\na: [a]\n}\n", outputStreamCaptor.toString(), "Output is not correct");
		
	}
	
	@Test
	public void testPost() throws Exception {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Edge e1 = new Edge(v1, v2);
		Edge e2 = new Edge(v1, v3);
		Set<Vertex> vertices = new HashSet<>();
		Set<Edge> edges = new HashSet<>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		edges.add(e1);
		edges.add(e2);
		Set<Vertex> heads = new HashSet<>();
		heads.add(v2);
		heads.add(v3);
		DirectedGraph g = new DirectedGraph(vertices, edges);
		assertEquals(heads, g.post(v1), "Tail is missing heads.");
	}
	
	@Test
	public void testPre() throws Exception {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Edge e1 = new Edge(v1, v3);
		Edge e2 = new Edge(v2, v3);
		Set<Vertex> vertices = new HashSet<>();
		Set<Edge> edges = new HashSet<>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		edges.add(e1);
		edges.add(e2);
		Set<Vertex> tails = new HashSet<>();
		tails.add(v1);
		tails.add(v2);
		DirectedGraph g = new DirectedGraph(vertices, edges);
		assertEquals(tails, g.pre(v3), "Head is missing tails.");
	}

}
