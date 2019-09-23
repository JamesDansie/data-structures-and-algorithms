package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testListCreation() {
        LinkedList list = new LinkedList();
        list = list.insertTail(list,2);
        list = list.insertTail(list,3);
        list = list.insertHead(list,1);

        assertEquals(
                "This should contain 1, 2, 3",
                "Linked List: 1 2 3 ",
                list.toString(list))
        ;
    }

    @Test
    public void testListCreationEmpty() {
        LinkedList list = new LinkedList();
        list.insertTail(2);
        list.insertTail(3);
        list.insertHead(1);

        assertEquals(
                "This should contain 1, 2, 3",
                "Linked List: 1 2 3 ",
                list.toString())
        ;
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
                list.contains(2))
        ;
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
                list.contains(10))
        ;
    }
}