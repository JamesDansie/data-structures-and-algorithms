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

    @Test
    public void testKthGood() throws IllegalAccessException {
        list.insertTail(4);
        list.insertTail(5);
        assertEquals("The list should be 1, 2, 3, 4, 5 and k=2 should be 3",
                3,
                list.kthFromEnd(2));
    }

    @Test
    public void testKthEnd() throws IllegalAccessException {
        list.insertTail(4);
        list.insertTail(5);
        assertEquals("The list should be 1, 2, 3, 4, 5 and k=2 should be 3",
                5,
                list.kthFromEnd(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKthNeg() throws IllegalAccessException {
        list.insertTail(4);
        list.insertTail(5);
        assertEquals("The list should be 1, 2, 3, 4, 5 and k=2 should be 3",
                5,
                list.kthFromEnd(-1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKthLong() throws IllegalAccessException {
        list.insertTail(4);
        list.insertTail(5);
        assertEquals("The list should be 1, 2, 3, 4, 5 and k=2 should be 3",
                5,
                list.kthFromEnd(10));
    }

    @Test
    public void testKthEqual() throws IllegalAccessException {
        list.insertTail(4);
        list.insertTail(5);
        assertEquals("The list should be 1, 2, 3, 4, 5 and k=2 should be 3",
                1,
                list.kthFromEnd(4));
    }

    @Test
    public void testMergeWorking(){
        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();
        ll1.insertTail(1);
        ll1.insertTail(3);
        ll1.insertTail(5);
        ll1.insertTail(7);
        ll2.insertTail(2);
        ll2.insertTail(4);
        ll2.insertTail(6);
        ll2.insertTail(8);

        LinkedList ll3 = LinkedList.mergedList(ll1, ll2);
        assertEquals("LL should be 1 through 8",
                "Linked List: 1 2 3 4 5 6 7 8",
            ll3.toString());
    }

    @Test
    public void testMergeNotWorking(){
        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();
        ll1.insertTail(1);
        ll1.insertTail(3);
        ll1.insertTail(5);
        ll1.insertTail(7);
        ll2.insertTail(2);
        ll2.insertTail(4);
        ll2.insertTail(6);
        ll2.insertTail(8);

        LinkedList ll3 = LinkedList.mergedList(ll1, ll2);
        assertNotEquals("LL should be 1 through 8",
                "Linked List: 1 2 3 4 5 6 7",
                ll3.toString());
    }

    @Test
    public void testMergeDiffLengths(){
        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();
        ll1.insertTail(1);
        ll1.insertTail(3);
        ll1.insertTail(5);
        ll1.insertTail(7);
        ll2.insertTail(2);
        ll2.insertTail(4);

        LinkedList ll3 = LinkedList.mergedList(ll1, ll2);
        assertNotEquals("LL should be 1 through 8",
                "Linked List: 1 2 3 4 5 7",
                ll3.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testShortList(){
        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();
        ll1.insertTail(1);
        ll1.insertTail(3);
        ll1.insertTail(5);
        ll1.insertTail(7);


        LinkedList ll3 = LinkedList.mergedList(ll1, ll2);
        assertNotEquals("LL should be 1 through 8",
                "Linked List: 1 2 3 4 5 7",
                ll3);
    }

    @Test
    public void stuff(){
        LinkedList testthing = new LinkedList();
        testthing.insertTail(1);
        testthing.insertTail(2);
        testthing.insertTail(3);
        testthing.insertTail(4);
        testthing.insertTail(5);
//        System.out.println("********TEST ***********");
//        System.out.println(testthing.head.next.next.next.value);
//        System.out.println("********TEST ***********");

        assertNotEquals("LL should be 1 through 8",
                "Linked List: 1 2 3 4 5 7",
                testthing);
    }
}