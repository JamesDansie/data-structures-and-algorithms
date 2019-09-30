package code401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    Stack<String> stack;

    @Before
    public void setUp() {
        stack = new Stack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
    }

    @Test
    public void push() {
        stack.push("d");
        String last = stack.pop();
        assertEquals("The pop should equal d",
                "d",
                last);
    }

    @Test
    public void pop() {
        assertEquals("The pop should equal c",
                "c",
                stack.pop());
    }

    @Test
    public void peek() {
        assertEquals("The peek should equal c",
                "c",
                stack.peek());
    }

    @Test
    public void testEmpty(){
        Stack<String> empty = new Stack<>();
        assertNull(empty.top);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyPop() throws Exception {
        Stack<String> empty = new Stack<>();
        assertNull(empty.pop());
    }
}