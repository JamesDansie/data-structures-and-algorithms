package code401challenges.stacksandqueues;

public class Queue<E> {
    Node<E> front;
    Node<E> back;

    public void queue(E o){
        //add to the front
        if(front == null){

            front = new Node<E>(o);
            back = front;
        } else {
            back.next =  new Node<E>(o);
            back = back.next;
        }
    }

    public E dequeue() {
        //returns node from the front
        if(front == null){
            throw new IllegalArgumentException("Queue is empty");
        } else {
            Node<E> tmp = front;
            front = front.next;
            return tmp.data;
        }
    }

    public E peek() {
        //returns data from the front
        if(front == null){
            throw new IllegalArgumentException("Queue is empty");
        } else {
            return front.data;
        }
    }
}
