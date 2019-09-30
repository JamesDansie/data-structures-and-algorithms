package code401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    Stack<String> stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
    }

    @Test
    public void push() throws Exception {
        stack.push("d");
        String last = stack.pop();
        assertEquals("The pop should equal d",
                "d",
                last);
    }

    @Test
    public void pop() throws Exception {
        assertEquals("The pop should equal c",
                "c",
                stack.pop());
    }

    @Test
    public void peek() {
    }
}