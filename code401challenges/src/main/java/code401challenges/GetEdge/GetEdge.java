package code401challenges.GetEdge;

import code401challenges.graph.Edge;
import code401challenges.graph.Graph;
import code401challenges.graph.Vertex;

public class GetEdge {
    public static int getEdge(Graph gin, String[] cities){
        if(gin == null ||
        cities == null ||
        cities.length < 2 ||
        gin.Size() < 2){
            throw new IllegalArgumentException();
        }

        int total = 0;
        Vertex curr = null;

        //Nodes are stored in a set. This grabs the node that matches the first city name
        for(Vertex vert : gin.GetNodes()){
            if(cities[0].equals(vert.getName())){ curr = vert;}
        }
        if(curr == null){return -1;}

        for(int i = 1; i < cities.length; i++){
            Vertex tmp = curr;
            for(Edge edge : curr.getEdges()){
                if(edge.getVert1().getName().equals(cities[i])){
                    total += edge.getWeight();
                    curr = edge.getVert1();
                    break;
                }
            }
            if(curr == tmp){return -1;}
        }
        return total;
    }
}
