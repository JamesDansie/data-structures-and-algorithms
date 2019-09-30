package code401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    Queue<String> test;

    @Before
    public void setUp() throws Exception {
        test = new Queue<>();
        test.queue("a");
        test.queue("b");
        test.queue("c");
    }

    @Test
    public void queue() {
        test.queue("d");
        assertEquals("The back should be d",
                "d",
                test.back.data);
    }

    @Test
    public void dequeue() {
        assertEquals("The front should be a",
                "a",
                test.dequeue());
    }

    @Test
    public void peek() {
        assertEquals("The front should be a",
                "a",
                test.peek());
    }
}