package code401challenges.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

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

    public int findMax(){
        return findMaxRecursive(root, root.data);
    }

    private int findMaxRecursive(Node curr, int max){
        if(curr == null){
            return max;
        }
        if(curr.data > max){
            max = curr.data;
        }
        max = findMaxRecursive(curr.left, max);
        max = findMaxRecursive(curr.right, max);

        return max;
    }

    //in class example
//    private int findMaxRecursive(Node curr){
//        if(curr == null){
//            return Integer.MIN_VALUE;
//        }
//        int max = curr.data;
//        int leftmax = findMaxRecursive(curr.left);
//        int rightmax = findMaxRecursive(curr.right);
//
//        if(leftmax > max){
//            max = leftmax;
//        }
//        if(rightmax > max){
//            max = rightmax;
//        }
//
//        return max;
//    }
}
