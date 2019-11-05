package code401challenges.graph;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class GraphTest {

    //Can't declare in @Before or else slcVert is hidden from the scope of other methods :(
    Graph test = new Graph();
    Vertex slcVert = test.AddNode("Salt Lake City");
    Vertex seaVert = test.AddNode("Seattle");
    Vertex portVert = test.AddNode("Portland");

    @Test
    public void addNodeGetNodes() {

        Vertex bosieVert = test.AddNode("Boise");
        assertTrue("Should have a boise node",
                test.GetNodes().contains(bosieVert));
    }

    @Test
    public void addEdgeAndNodeGetEdges() {
        test.AddEdge(837, seaVert, slcVert);
        test.AddEdge(162, seaVert, portVert);
        test.AddEdge(770, portVert, slcVert);

        test.AddEdge(341, test.AddNode("Boise"), this.slcVert);
        assertEquals("The first edge to Seattle should be 837 miles",
                837,
                slcVert.getEdges().get(0).weight);
    }

    @Test
    public void getNodes() {
        Set<Vertex> nodes = test.GetNodes();

        assertTrue(nodes.contains(slcVert));
        assertTrue(nodes.contains(seaVert));
        assertTrue(nodes.contains(portVert));
    }

    @Test
    public void getNeighbors() {
        test.AddEdge(837, seaVert, slcVert);
        test.AddEdge(162, seaVert, portVert);
        test.AddEdge(770, portVert, slcVert);

        assertTrue(test.GetNeighbors(slcVert).get(0).weight == 837);
    }

    @Test
    public void size() {
        assertEquals("Should be length of 3",
                3,
                test.Size());
    }
}