package code401challenges.mergeSort;

import java.util.Arrays;

public class MergeSort {
    public static int[] sort(int[] arrIn){
        if(arrIn.length < 2){
            return arrIn;
        } else {
            int[] left = sort(Arrays.copyOfRange(arrIn, 0, arrIn.length/2));
            int[] right = sort(Arrays.copyOfRange(arrIn, arrIn.length/2, arrIn.length));
            return merge(left, right, arrIn);
        }
    }

    public static int[] merge(int[] left, int[] right, int[] arrIn){
        int i = 0;
        int j = 0;
        while(i + j < arrIn.length){
            if(j == right.length || i < left.length && left[i] < right[j]){
                arrIn[i+j] = left[i];
                i++;
            } else {
                arrIn[i+j] = right[j];
                j++;
            }
        }

        return arrIn;
    }
}
