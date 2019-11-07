package code401challenges.DepthFirst;

import code401challenges.graph.Graph;
import code401challenges.graph.Vertex;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepthFirstTest {

    @Test
    public void depthFirst() {
        Graph test = new Graph();
        Vertex SLC = test.AddNode("SLC");
        Vertex Sea = test.AddNode("Seattle");
        Vertex Port = test.AddNode("Portland");
        Vertex Den = test.AddNode("Denver");
        Vertex Van = test.AddNode("Vancouver");

        test.AddEdge(850, SLC, Sea);
        test.AddEdge(170, Sea, Port);
        test.AddEdge(700, Port, SLC);
        test.AddEdge(160, Van, Sea);
        test.AddEdge(530, SLC, Den);

        assertEquals("Should start in Denver, then SLC, then Sea/Port, finally Van",
                "[Vertex{name='Denver', edges=SLC 530}, Vertex{name='SLC', edges=Seattle 850, Portland 700, Denver 530}, Vertex{name='Seattle', edges=SLC 850, Portland 170, Vancouver 160}, Vertex{name='Portland', edges=Seattle 170, SLC 700}, Vertex{name='Vancouver', edges=Seattle 160}]",
                DepthFirst.depthFirst(Den).toString());
    }
}
