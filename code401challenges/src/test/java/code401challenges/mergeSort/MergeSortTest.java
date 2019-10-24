package code401challenges.mergeSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void sort() {
        int[] arr1 = new int[]{6, 4, 2, 1, 3, 5};
        System.out.println(Arrays.toString(MergeSort.sort(arr1)));
        System.out.println(Arrays.toString(arr1));
    }
}