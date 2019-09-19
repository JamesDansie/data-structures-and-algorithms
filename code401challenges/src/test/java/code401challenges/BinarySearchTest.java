package code401challenges;

import static org.junit.Assert.*;
import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void testNotHere() {
        assertEquals(
                "This should not find anything",
                -1,
                BinarySearch.binarySearch(new int[]{1, 2, 3, 4}, 5)
                );
    }

    @Test
    public void testSmall() {
        assertEquals(
                "This should not find anything",
                1,
                BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 7, 9, 10, 20, 30}, 2)
        );
    }

    @Test
    public void testBig() {
        assertEquals(
                "This should not find anything",
                7,
                BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 7, 9, 10, 20, 30}, 20)
        );
    }
}