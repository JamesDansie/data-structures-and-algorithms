package code401challenges.linkedList;

// Shamelessly copied from; https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
public class LinkedList {

    Node head;

    class Node {
        int value;
        Node next;

        //Node constructor, only ints for now
        Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    public void insertTail(int value){
        Node newNode = new Node(value);
        newNode.next = null;

        //checking to see if the list is empty
        if(this.head == null){
            this.head = newNode;
        } else {
            Node lastNode = this.head;

            //looking for the end of the list
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }

    public void insertHead(int value){
        Node newNode = new Node(value);
        Node temp = null;

        if(this.head == null){
            this.head = newNode;
        } else{
            temp = this.head;
            this.head = newNode;
            this.head.next = temp;
        }
    }


    public String toString(){
        Node currentNode = this.head;
        String outPut = "Linked List: ";

        while(currentNode != null){
            outPut += currentNode.value + " ";

            currentNode = currentNode.next;
        }
        return outPut;
    }

    public boolean contains(int test){
        boolean contains = false;
        Node currentNode = this.head;

        while(currentNode != null){
            if(currentNode.value == test){
                contains = true;
            }
            currentNode = currentNode.next;
        }
        return contains;
    }
}
