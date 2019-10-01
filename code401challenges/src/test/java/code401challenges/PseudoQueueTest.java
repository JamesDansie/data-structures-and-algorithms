package code401challenges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    PseudoQueue queueTest = new PseudoQueue();
    @Before
    public void setUp() throws Exception {
        queueTest.enqueue(1);
        queueTest.enqueue(2);
        queueTest.enqueue(3);
        queueTest.enqueue(4);

    }

    @Test
    public void dequeue() {
        assertEquals("The last value should be 4",
                1,
                queueTest.dequeue());
    }

    @Test
    public void dequeueMore() {
        queueTest.dequeue();
        queueTest.dequeue();
        queueTest.dequeue();
        assertEquals("The last value should be 4",
                4,
                queueTest.dequeue());
    }
}