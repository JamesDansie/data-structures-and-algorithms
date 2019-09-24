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
        this.head = new Node(value, this.head);
    }

    public boolean insertBefore(int newVal, int key){
        boolean success = false;
        Node newNode = new Node(newVal);

        if(head == null || head.next == null){
            System.out.println("List is too short");
        } else if(head.value == key){
            insertHead(newVal);
        } else {
            Node prevNode = head;
            Node currNode = head.next;

            while(currNode != null && currNode.value != key){
                prevNode = prevNode.next;
                currNode = currNode.next;
            }

            if(currNode == null){
                System.out.println(String.format("Did not find the value %d",key));
            } else {
                newNode.next = currNode;
                prevNode.next = newNode;
                success = true;
            }
        }
        return success;
    }

    public boolean insertAfter(int newVal, int key){
        boolean success = false;
        Node newNode = new Node(newVal);
        if(head == null || head.next == null){
            System.out.println("List is too short");
        } else {
            Node currNode = head;
            Node nextNode = head.next;

            while(nextNode != null && currNode.value != key){
                currNode = currNode.next;
                nextNode = nextNode.next;
            }

            if(nextNode == null) {
                System.out.println(String.format("Did not find the value %d", key));
            } else {
                newNode.next = nextNode;
                currNode.next = newNode;
                success = true;
            }
        }
        return success;
    }

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
