package code401challenges.linkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    LinkedList list = new LinkedList();
    @Before
    public void setup(){
        list.insertTail(2);
        list.insertTail(3);
        list.insertHead(1);
    }

    @Test
    public void testCreate(){
        LinkedList emptyList = new LinkedList();
        assertNull(emptyList.head);
    }

    @Test
    public void testHead() {
        assertEquals(
                "Head should be 1",
                1,
                list.head.value);
    }

    @Test
    public void testListCreationInsert() {
        assertEquals(
                "This should contain 1, 2, 3",
                "Linked List: 1 2 3",
                list.toString());
    }

    @Test
    public void testContainsTrue(){
        assertEquals(
                "This should contain 1, 2, 3",
                true,
                list.contains(2));
    }

    @Test
    public void testContainsFalse(){
        assertEquals(
                "This should contain 1, 2, 3",
                false,
                list.contains(10));
    }

    @Test
    public void testInsertBefore(){
        list.insertBefore(10, 2);
        assertEquals("The list should be 1, 10, 2, 3",
                "Linked List: 1 10 2 3",
                list.toString());
    }

    @Test
    public void testInsertBeforeNotFound(){
        assertFalse("Looking for a key that does not exist", list.insertBefore(10, 10));
    }

    @Test
    public void testInsertBeforeTooShort(){
        LinkedList shorty = new LinkedList();
        assertFalse("The list is too short", list.insertBefore(10, 10));
    }

    @Test
    public void testInsertAfter(){
        list.insertAfter(10,2);
        assertEquals("The list should be 1, 2, 10, 3",
                "Linked List: 1 2 10 3",
                list.toString());
    }

    @Test
    public void testInsertAfterNotFound(){
        assertFalse("Looking for a key that does not exist", list.insertAfter(10, 10));
    }

    @Test
    public void testInsertAfterTooShort(){
        LinkedList shorty = new LinkedList();
        assertFalse("The list is too short", list.insertBefore(10, 10));
    }
}