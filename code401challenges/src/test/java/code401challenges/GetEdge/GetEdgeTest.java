package code401challenges.GetEdge;

import code401challenges.graph.Graph;
import code401challenges.graph.Vertex;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetEdgeTest {
    Graph testG = new Graph();
    Vertex SLC = testG.AddNode("SLC");
    Vertex VAN = testG.AddNode("VAN");
    Vertex SEA = testG.AddNode("SEA");
    Vertex PORT = testG.AddNode("PORT");
    Vertex DEN = testG.AddNode("DEN");
    Vertex LV = testG.AddNode("LV");

    @Test
    public void getEdgePass() {
        testG.AddEdge(75, VAN, SEA);
        testG.AddEdge(50, SEA, PORT);
        testG.AddEdge(100, SEA, SLC);
        testG.AddEdge(200, SEA, DEN);
        testG.AddEdge(125, SLC, LV);

        String[] cities = new String[]{"VAN", "SEA", "SLC"};

        assertEquals("Fare for VAN to SEA to SLC is 175",
                175,
                GetEdge.getEdge(testG, cities));
    }

    @Test
    public void getEdgeFail() {
        testG.AddEdge(75, VAN, SEA);
        testG.AddEdge(50, SEA, PORT);
        testG.AddEdge(100, SEA, SLC);
        testG.AddEdge(200, SEA, DEN);
        testG.AddEdge(125, SLC, LV);

        String[] cities = new String[]{"VAN", "SEA", "LV"};

        assertEquals("Fare for VAN to SEA to SLC is 175",
                -1,
                GetEdge.getEdge(testG, cities));
    }
}