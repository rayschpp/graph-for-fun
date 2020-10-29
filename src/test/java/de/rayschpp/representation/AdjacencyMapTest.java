/**
 * 
 */
package de.rayschpp.representation;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.rayschpp.model.Vertex;

/**
 * @author raynhold
 *
 */
class AdjacencyMapTest {

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
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link de.rayschpp.representation.AdjacencyMap#AdjacencyMap(java.lang.String)}.
	 */
	@Test
	public void testAdjacencyMapString() {
		String string = "a:[a,b]\nb:[]";
		AdjacencyMap adjacencyMap = new AdjacencyMap(string );
		Set<Vertex> vertices = new HashSet<>();
		vertices.add(new Vertex('a'));
		vertices.add(new Vertex('b'));
		assertEquals(vertices, adjacencyMap.keySet(), "Missing vertices.");
		
	}

	/**
	 * Test method for {@link de.rayschpp.representation.AdjacencyMap#getHeads(de.rayschpp.model.Vertex)}.
	 */
	@Test
	public void testGetHeads() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link de.rayschpp.representation.AdjacencyMap#AdjacencyMap(de.rayschpp.model.DirectedGraph)}.
	 */
	@Test
	public void testAdjacencyMapDirectedGraph() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link de.rayschpp.representation.AdjacencyMap#toString()}.
	 */
	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link de.rayschpp.representation.AdjacencyMap#getTails()}.
	 */
	@Test
	public void testGetTails() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link de.rayschpp.representation.AdjacencyMap#getEdges()}.
	 */
	@Test
	public void testGetEdges() {
		fail("Not yet implemented");
	}

	@Test
	public void testFoo() throws Exception {
		assertEquals(true, false);
	}
}
