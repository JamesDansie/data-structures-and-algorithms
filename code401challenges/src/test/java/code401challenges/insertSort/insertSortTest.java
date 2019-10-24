package code401challenges.insertSort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class insertSortTest {
    int[] test;
    @Before
    public void setUp() throws Exception {
        test = new int[]{4, 3, 1, 6, 8, 10, 100000};
    }

    @Test
    public void insertionSort() {
        InsertSort.InsertionSort(test);
        assertArrayEquals("Sorted array",
                test,
                new int[]{1, 3, 4, 6, 8, 10, 100000});
    }

    @Test
    public void insertionSortRepeat() {
        int[] testo = new int[]{1, 1, 1, 1, 2, 1};
        InsertSort.InsertionSort(testo);
        assertArrayEquals("Repeated sort array",
                testo,
                new int[]{1, 1, 1, 1, 1, 2});
    }

    @Test
    public void insertShort() {
        int[] testo = new int[]{1};
        InsertSort.InsertionSort(testo);
        assertArrayEquals("Repeated sort array",
                testo,
                new int[]{1});
    }
}