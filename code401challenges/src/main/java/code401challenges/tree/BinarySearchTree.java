package code401challenges.tree;

import code401challenges.linkedList.LinkedList;

public class BinarySearchTree {
    Node root;

    public void add(int data){
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node curr, int data){
        if(curr == null){
            return new Node(data);
        }

        //little values to the left, big stuff to the right
        if(data < curr.data){
            curr.left = addRecursive(curr.left, data);
        } else if (data > curr.data){
            curr.right = addRecursive(curr.right, data);
        } else {
            return curr;
        }

        return curr;
    }

    public boolean contains(int data){
        return containsRecursive(root, data);
    }

    private boolean containsRecursive(Node curr, int data){
        if(curr == null){
            return false;
        }
        if(data == curr.data){
            return true;
        }
        if(data < curr.data){
            return containsRecursive(curr.left, data);
        } else {
            return containsRecursive(curr.right, data);
        }
    }

    public LinkedList traversePreOrder(){
        return traversePreOrderRecurse(root, new LinkedList() );
    }

    private LinkedList traversePreOrderRecurse(Node node, LinkedList list){
        if(node != null){
            list.insertTail(node.data);
            traverseInOrderRecurse(node.left, list);
            traverseInOrderRecurse(node.right, list);
        }
        return list;
    }

    public LinkedList traverseInOrder(){
        return traverseInOrderRecurse(root, new LinkedList() );
    }

    private LinkedList traverseInOrderRecurse(Node node, LinkedList list){
        if(node != null){
            traverseInOrderRecurse(node.left, list);
            list.insertTail(node.data);
            traverseInOrderRecurse(node.right, list);
        }
        return list;
    }

    public LinkedList traversePostOrder(){
        return traversePostOrderRecurse(root, new LinkedList() );
    }

    private LinkedList traversePostOrderRecurse(Node node, LinkedList list){
        if(node != null){
            traversePostOrderRecurse(node.left, list);
            traversePostOrderRecurse(node.right, list);
            list.insertTail(node.data);
        }
        return list;
    }
}
