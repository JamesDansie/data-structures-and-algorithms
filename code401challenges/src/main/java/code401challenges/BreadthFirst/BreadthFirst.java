package code401challenges.BreadthFirst;

import code401challenges.graph.Edge;
import code401challenges.graph.Vertex;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BreadthFirst {
    public static LinkedList<Vertex> breadthFirst(Vertex startNode){
        Set<Vertex> set = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();
        LinkedList<Vertex> ll = new LinkedList<>();
        ll.add(startNode);
        set.add(startNode);
        Vertex curr = startNode;

        while(curr != null){
            for(Edge edge : curr.getEdges()){
                if(!set.contains(edge.getVert1())){
                    set.add(edge.getVert1());
                    ll.add(edge.getVert1());
                    queue.add(edge.getVert1());
                }
            }
            curr = queue.poll();
        }
        return ll;
    }
}
