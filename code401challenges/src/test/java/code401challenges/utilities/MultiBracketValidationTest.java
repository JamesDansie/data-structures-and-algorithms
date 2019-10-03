package code401challenges.utilities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    MultiBracketValidation test = new MultiBracketValidation();

    @Test
    public void multiBracketValidation1() {
        assertTrue(test.multiBracketValidation("()"));
    }

    @Test
    public void multiBracketValidation2() {
        assertTrue(test.multiBracketValidation("{}"));
    }

    @Test
    public void multiBracketValidation3() {
        assertTrue(test.multiBracketValidation("[]"));
    }

    @Test
    public void multiBracketValidation4() {
        assertFalse(test.multiBracketValidation("[}"));
    }

    @Test
    public void multiBracketValidation5() {
        assertTrue(test.multiBracketValidation("blah ()"));
    }

    @Test
    public void multiBracketValidation6() {
        assertFalse(test.multiBracketValidation("({)}"));
    }

    @Test
    public void multiBracketValidation7() {
        assertTrue(test.multiBracketValidation("{[()[]]}"));
    }

    @Test
    public void multiBracketValidation8() {
        assertFalse(test.multiBracketValidation("("));
    }
}