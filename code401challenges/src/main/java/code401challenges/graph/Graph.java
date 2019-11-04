package code401challenges.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph {
    Set<Vertex> vertices;

    public Graph() {
        this.vertices = new HashSet<Vertex>();
    }

    public Vertex AddNode(String name){
        Vertex newVert = new Vertex(name);
        vertices.add(newVert);
        return newVert;
    }

    public void AddEdge(int weight, Vertex vert1, Vertex vert2){
        if(vertices.contains(vert1) && vertices.contains(vert2)){
            for(Vertex vertex : vertices){
                if(vertex.equals(vert1)){
                    vertex.addEdge(new Edge(weight, vert2));
                }
                if (vertex.equals(vert2)) {
                    vertex.addEdge(new Edge(weight, vert1));
                }
            }
        } else {
            throw new IllegalArgumentException("does not contain both vertices");
        }
    }

    public Set<Vertex> GetNodes(){
        return vertices;
    }

    public List<Edge> GetNeighbors(Vertex vertexIn){
        return vertexIn.getEdges();
    }

    public int Size(){
        return vertices.size();
    }

    @Override
    public String toString() {
        return "Graph{" +
                "vertices=" + vertices +
                '}';
    }
}
