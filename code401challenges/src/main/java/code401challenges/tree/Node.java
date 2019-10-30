package code401challenges.tree;

// Useful references
// https://www.baeldung.com/java-binary-tree
// https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
// https://stackoverflow.com/questions/22927184/trying-to-use-hashmap-to-count-frequency-of-words-in-array
public class Node {
    public Node left;
    public Node right;
    public int data;

    public Node(Node left,Node right,int data){
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public Node(int data){
        this.left = null;
        this.right = null;
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("%d",this.data);
    }
}
