package code401challenges.sortInsertion;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SortInsertionTest {
    int[] test;
    @Before
    public void setUp() throws Exception {
        test = new int[]{4, 3, 1, 6, 8, 10, 100000};
    }

    @Test
    public void insertionSort() {
        SortInsertion.InsertionSort(test);
        assertArrayEquals("Sorted array",
                test,
                new int[]{1, 3, 4, 6, 8, 10, 100000});
    }

    @Test
    public void insertionSortRepeat() {
        int[] testo = new int[]{1, 1, 1, 1, 2, 1};
        SortInsertion.InsertionSort(testo);
        assertArrayEquals("Repeated sort array",
                testo,
                new int[]{1, 1, 1, 1, 1, 2});
    }

    @Test
    public void insertShort() {
        int[] testo = new int[]{1};
        SortInsertion.InsertionSort(testo);
        assertArrayEquals("Repeated sort array",
                testo,
                new int[]{1});
    }
}