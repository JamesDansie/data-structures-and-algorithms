package code401challenges.stacksandqueues;

//generic node type from; https://stackoverflow.com/questions/19128858/implementing-node-as-a-generic-class
public class Node <E> {

    E data;
    Node<E> next;

    //Node constructor, only ints for now
    Node(E value){
        this(value, null);
    }

    Node(E value, Node next){
        this.data = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
