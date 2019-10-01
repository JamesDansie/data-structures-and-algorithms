package code401challenges.stacksandqueues;

public class Stack<E> {

    Node<E> top;

    //adds a node at the beginning
    public void push(E o){this.top = new Node<E>(o, this.top);}

    public E pop() {
        if(top == null){
            throw new IllegalArgumentException("The stack is empty");
        } else {
            Node<E> tmp = top;
            top = top.next;
            return tmp.data;
        }
    }

    public E peek(){
        if(top == null){
            throw new IllegalArgumentException("The stack is empty");
        } else {
            return top.data;
        }
    }

    public boolean empty(){
        return this.top == null;
    }
}
