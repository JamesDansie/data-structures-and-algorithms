package code401challenges.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    //caused conflicts with other file structure
//    class Node{
//        int value;
//        Node left;
//        Node right;
//
//        public Node(int value){
//            this.value = value;
//            this.left = null;
//            this.right = null;
//        }
//    }

    Node root;

    public void breadthprint(){
        Queue<Node> queue = new LinkedList<Node>();
        if(root != null){
            queue.add(root);
        } else {
            System.out.println("Empty tree");
        }

        while(!queue.isEmpty()){
            Node tmp = queue.remove();
            System.out.println(tmp.data);
            if(tmp.left != null){
                queue.add(tmp.left);
            }
            if(tmp.right != null){
                queue.add(tmp.right);
            }
        }
    }
}
