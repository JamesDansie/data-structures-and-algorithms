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
    public void add() {
    }

    @Test
    public void contains() {
    }

    @Test
    public void traverseInOrder() {
        System.out.println(test.traverseInOrder());
    }

    @Test
    public void traversePreOrder() {
        System.out.println(test.traversePreOrder());
    }

    @Test
    public void traversePostOrder() {
        System.out.println(test.traversePostOrder());
    }
}