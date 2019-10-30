package code401challenges.TreeIntersection;

import code401challenges.hashtable.Hashtable;
import code401challenges.tree.BinaryTree;
import code401challenges.tree.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeIntersectionTest {
    BinaryTree tree1;
    BinaryTree tree2;
    @Before
    public void setUp() throws Exception {
        tree1 = new BinaryTree();
        tree2 = new BinaryTree();

        tree1.root = new Node(5);
        tree1.root.left = new Node(6);
        tree1.root.right = new Node(4);
        tree1.root.right.right = new Node(1);

        tree2.root = new Node(5);
        tree2.root.left = new Node(6);
        tree2.root.right = new Node(4);
        tree2.root.right.right = new Node(2);
    }

    @Test
    public void tree_intersection() {
        Hashtable ans = TreeIntersection.tree_intersection(tree1, tree2);
        assertTrue(ans.contains("4"));
        assertTrue(ans.contains("5"));
        assertTrue(ans.contains("6"));
        assertFalse(ans.contains("1"));
        assertFalse(ans.contains("2"));
    }
}