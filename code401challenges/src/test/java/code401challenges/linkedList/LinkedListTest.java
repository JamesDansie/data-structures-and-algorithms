package code401challenges.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testCreate(){
        LinkedList list = new LinkedList();
        assertNull(list.head);
    }

    @Test
    public void testHead() {
        LinkedList list = new LinkedList();
        list.insertTail(2);
        list.insertTail(3);
        list.insertHead(1);

        assertEquals(
                "Head should be 1",
                1,
                list.head.value);
    }

    @Test
    public void testListCreationInsert() {
        LinkedList list = new LinkedList();
        list.insertTail(2);
        list.insertTail(3);
        list.insertHead(1);

        assertEquals(
                "This should contain 1, 2, 3",
                "Linked List: 1 2 3 ",
                list.toString());
    }

    @Test
    public void testContainsTrue(){
        LinkedList list = new LinkedList();
        list.insertTail(2);
        list.insertTail(3);
        list.insertHead(1);

        assertEquals(
                "This should contain 1, 2, 3",
                true,
                list.contains(2));
    }

    @Test
    public void testContainsFalse(){
        LinkedList list = new LinkedList();
        list.insertTail(2);
        list.insertTail(3);
        list.insertHead(1);

        assertEquals(
                "This should contain 1, 2, 3",
                false,
                list.contains(10));
    }
}