package code401challenges;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test
    public void testInsertShiftOddArray() {
        assertEquals(
                "This should insert in the middle",
                "[1, 2, 3, 6, 4, 5]",
                Arrays.toString(ArrayShift.insertShiftArray(new int[]{1,2,3,4,5}, 6)));
    }

    @Test
    public void testInsertShiftEvenArray() {
        assertEquals(
                "This should insert in the middle",
                "[1, 2, 6, 3, 4]",
                Arrays.toString(ArrayShift.insertShiftArray(new int[]{1,2,3,4}, 6)));
    }

    @Test
    public void testInsertShiftEmptyArray() {
        assertEquals(
                "This should insert in the middle",
                "[6]",
                Arrays.toString(ArrayShift.insertShiftArray(new int[]{}, 6)));
    }
}