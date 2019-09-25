package code401challenges.linkedList;

import java.util.StringJoiner;

// Shamelessly copied from; https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
public class LinkedList {

    Node head;

    class Node {
        int value;
        Node next;

        //Node constructor, only ints for now
        Node(int value){
            this(value, null);
        }

        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    //adds a node at the end
    public void insertTail(int value){
        Node newNode = new Node(value);

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

    //adds a node at the beginning
    public void insertHead(int value){
        this.head = new Node(value, this.head);
    }

    //adds a node before the key. returns true if successful, false otherwise
    public boolean insertBefore(int newVal, int key){
        boolean success = false;
        Node newNode = new Node(newVal);

        //checking the list is long enough to run
        if(head == null || head.next == null){
            System.out.println("List is too short");
        } else if(head.value == key){
            //if it's short then add it right away
            insertHead(newVal);
        } else {
            Node prevNode = head;
            Node currNode = head.next;

            //if the loop finds the end or the key it stops
            while(currNode != null && currNode.value != key){
                prevNode = prevNode.next;
                currNode = currNode.next;
            }

            //if we get to the end without find the key then let the user know
            if(currNode == null){
                System.out.println(String.format("Did not find the value %d",key));
            } else {
                //add the new node
                newNode.next = currNode;
                prevNode.next = newNode;
                success = true;
            }
        }
        return success;
    }

    //adds a new node after finding the key. Returns true if successfully added, returns false otherwise.
    public boolean insertAfter(int newVal, int key){
        boolean success = false;
        Node newNode = new Node(newVal);

        //checking if the list is long enough to loop
        if(head == null || head.next == null){
            System.out.println("List is too short");
        } else {
            Node currNode = head;
            Node nextNode = head.next;

            //if the loop finds the end of the list or the key it stops
            while(nextNode != null && currNode.value != key){
                currNode = currNode.next;
                nextNode = nextNode.next;
            }

            //if the loop reached the end without finding the key then let the user know
            if(nextNode == null) {
                System.out.println(String.format("Did not find the value %d", key));
            } else {
                //add the new node
                newNode.next = nextNode;
                currNode.next = newNode;
                success = true;
            }
        }
        return success;
    }

    //string method
    @Override
    public String toString(){
        Node currentNode = this.head;

        StringJoiner sj = new StringJoiner(" ");
        sj.add("Linked List:");

        while(currentNode != null){
            sj.add("" + currentNode.value);
            currentNode = currentNode.next;
        }
        return sj.toString();
    }

    public int kthFromEnd(int k) throws IllegalAccessException {
        Node p1 = this.head;
        Node p2 = this.head;
        if(k < 0){throw new IllegalArgumentException("K cannot be negative");}
        if(this.head == null){throw new IllegalAccessException("The list is empty");}

        int count = 0;

        //setting up k to initially be offset by k
        while(p2 != null && count < k){
            p2 = p2.next;
            count++;
        }
        //checking k isn't too long
        if(k > count){throw new IllegalArgumentException("K must be smaller than the list length");}

        //if count == k then the while loop counted enough, otherwise the while loop hit a null
        if(count == (k)){
            while(p2.next != null){
                p2 = p2.next;
                p1 = p1.next;
            }
        }
        return p1.value;
    }

    //checking for a value in the list
    public boolean contains(int test){
        Node currentNode = this.head;

        while(currentNode != null){
            if(currentNode.value == test){
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }
}
