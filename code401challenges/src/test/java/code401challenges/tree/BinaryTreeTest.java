package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    BinaryTree test;
    @Before
    public void setUp() throws Exception {
        test = new BinaryTree();
        test.root = new Node(1);
        test.root.left = new Node(10);
        test.root.right = new Node(3);
        test.root.left.left = new Node(4);
        test.root.left.right = new Node(5);
    }

    //how would you test this? return a string instead?
    @Test
    public void breadthprint() {
        test.breadthprint();
    }

    @Test
    public void findMax(){
        assertEquals("max is 10",
                10,
                test.findMax());
    }

}