package code401challenges.TreeIntersection;

import code401challenges.hashtable.Hashtable;
import code401challenges.tree.BinaryTree;
import code401challenges.tree.Node;

import java.util.LinkedList;

public class TreeIntersection {
    public static Hashtable tree_intersection(BinaryTree tree1, BinaryTree tree2){
        Hashtable set1 = new Hashtable();
        Hashtable set2 = new Hashtable();
        Node curr1 = tree1.root;
        Node curr2 = tree2.root;
        LinkedList<String> values = new LinkedList<>();

        treeTraversal(curr1, set1);
        treeTraversalLL(curr2, values);

        //turns out your can't loop through a set, who knew?
//        for(String data: set1){
//
//        }
        for(String value : values){
            if(set1.contains(value)){
                set2.add(value, null);
            }
        }
        return set2;
    }
    public static void treeTraversal(Node curr, Hashtable set){
        if(curr == null){
            return;
        }
        set.add(Integer.toString(curr.data), null);
        treeTraversal(curr.left, set);
        treeTraversal(curr.right, set);
    }
    public static void treeTraversalLL(Node curr, LinkedList<String> values){
        if(curr == null){
            return;
        }
        values.add(Integer.toString(curr.data));
        treeTraversalLL(curr.left, values);
        treeTraversalLL(curr.right, values);
    }
}
