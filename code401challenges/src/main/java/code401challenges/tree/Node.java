package code401challenges.tree;

// Useful references
// https://www.baeldung.com/java-binary-tree
public class Node {
    Node left;
    Node right;
    int data;

    Node(Node left,Node right,int data){
        this.left = left;
        this.right = right;
        this.data = data;
    }

    Node(int data){
        this.left = null;
        this.right = null;
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("%d",this.data);
    }
}
