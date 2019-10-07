package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    BinarySearchTree test;
    @Before
    public void setUp() throws Exception {
        test = new BinarySearchTree();
        test.add(6);
        test.add(4);
        test.add(8);
        test.add(3);
        test.add(5);
        test.add(7);
        test.add(9);
    }

    @Test
    public void instantiate(){
        BinarySearchTree blah = new BinarySearchTree();
        assertNull("blah should be null",
                blah.root);
    }

    @Test
    public void single(){
        BinarySearchTree blah = new BinarySearchTree();
        blah.add(6);
        assertEquals("Root is 6",
                6,
                blah.root.data);
    }

    @Test
    public void contains() {
        assertTrue("The tree contains 3",
                test.contains(3));
    }

    @Test
    public void traverseInOrder() {
        assertEquals("The linked list should be 3 4 5 6 7 8",
                "Linked List: 3 4 5 6 7 8 9",
        test.traverseInOrder().toString());
        System.out.println(test.traverseInOrder());
    }

    @Test
    public void traversePreOrder() {
        assertEquals("The linked list should be 6 3 4 5 7 8 9",
                "Linked List: 6 3 4 5 7 8 9",
                test.traversePreOrder().toString());
        System.out.println(test.traversePreOrder());
    }

    @Test
    public void traversePostOrder() {
        assertEquals("The linked list should be 3 5 4 7 9 8 6",
                "Linked List: 3 5 4 7 9 8 6",
                test.traversePostOrder().toString());
        System.out.println(test.traversePostOrder());
    }
}