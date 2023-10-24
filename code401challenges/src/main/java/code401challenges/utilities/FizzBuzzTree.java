package code401challenges.utilities;

import java.util.Random;

public class FizzBuzzTree {
    Node root;

    public void add(String data){
        root = recursiveAdd(root, data);
    }
    private Node recursiveAdd(Node curr, String data){
        if(curr == null){
            return new Node(data);
//        } else if(curr.left == null){
//            curr.left = recursiveAdd(curr.left, data);
//        } else if(curr.right == null){
//            curr.right = recursiveAdd(curr.right, data);
        } else if(randInt() == 0){
            curr.left = recursiveAdd(curr.left, data);
        } else {
            curr.right = recursiveAdd(curr.right, data);
        }
        return curr;
    }
    public int randInt(){
        Random rand = new Random();
        return rand.nextInt(2);
    }

    public String FizzBuzz(String input){
        int data = Integer.parseInt(input);
        if(data % 3 == 0 && data % 5 == 0){
            return "FizzBuzz";
        } else if (data % 3 == 0) {
            return "Fizz";
        } else if (data % 5 == 0) {
            return "Buzz";
        } else {
            return input;
        }
    }

    public void FizzBuzzTree(){
        FBTRecursion(root);
    }
    private void FBTRecursion(Node curr){
        if (curr != null){
            FBTRecursion(curr.left);
            curr.data = FizzBuzz(curr.data);
            FBTRecursion(curr.right);
        }
    }

    public void inOrder(){
        inOrderRec(root);
    }
    private void inOrderRec(Node curr){
        if(curr != null){
            inOrderRec(curr.left);
            System.out.println(" " + curr.data);
            inOrderRec(curr.right);
        }
    }
}
class Node{
    String data;
    Node left;
    Node right;

    Node(String data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}