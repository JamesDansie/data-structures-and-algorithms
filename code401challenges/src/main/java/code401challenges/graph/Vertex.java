package code401challenges.graph;

import java.util.LinkedList;
import java.util.List;

public class Vertex {
    private String name;
    private List<Edge> edges;

    Vertex(String name){
        this.name = name;
        edges = new LinkedList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    public Edge addEdge(Edge edge){
        edges.add(edge);
        return edge;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Edge edge : edges){
            sb.append(edge.vert1.name);
            sb.append(" ");
            sb.append(edge.weight);
            sb.append(", ");
        }

        return "Vertex{" +
                "name='" + name + '\'' +
                ", edges=" + sb.substring(0, sb.length()-2) +
                '}';
    }
}
