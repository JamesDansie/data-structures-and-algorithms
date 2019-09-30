package code401challenges.stacksandqueues;

public class Stack<E> {

    Node<E> top;

    //adds a node at the beginning
    public void push(E o){this.top = new Node<E>(o, this.top);}

    public E pop() throws Exception {
        if(top == null){
            throw new Exception("The stack is empty");
        } else {
            Node<E> tmp = top;
            top = top.next;
            return tmp.data;
        }
    }

    public E peek(){
        return top.data;
    }
}
