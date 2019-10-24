package code401challenges.quickSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void sort() {
        int[] test = new int[]{5, 2, 3, 1, 6, 10, -3};
        QuickSort sorter = new QuickSort();
        sorter.sort(test, 0, test.length-1);
        System.out.println(Arrays.toString(test));
    }
}