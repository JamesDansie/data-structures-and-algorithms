package code401challenges.DepthFirst;

import code401challenges.graph.Edge;
import code401challenges.graph.Vertex;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

public class DepthFirst {
    public static LinkedList<Vertex> depthFirst(Vertex startNode){
        Set<Vertex> set = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();
        LinkedList<Vertex> ll = new LinkedList<>();
        ll.add(startNode);
        set.add(startNode);
        stack.add(startNode);
        Vertex curr = startNode;

        while(!stack.empty()){
            for(Edge edge : curr.getEdges()){
                if(!set.contains(edge.getVert1())){
                    set.add(edge.getVert1());
                    ll.add(edge.getVert1());
                    stack.add(edge.getVert1());
                }
            }
            curr = stack.pop();
        }
        return ll;
    }
}
