package code401challenges.quickSort;

import java.util.Random;

public class QuickSort {
    public void sort(int [] arr, int left, int right){
        if(left < right){
            int pos = partition(arr, left, right);
            sort(arr, left, pos - 1);
            sort(arr, pos + 1, right);
        }
    }

    // from https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
    public int randInt(int min, int max){
        Random rand = new Random();
        int randomInt = rand.nextInt((max-min)+1)+min;
        return randomInt;
    }

    public int partition(int[] arr,int left,int right){
//        int pivot = arr[randInt(left, right)];
        int pivot = arr[right];
        int low = left-1;

        for(int i = left; i < right; i++){
            if(arr[i] < pivot){
                low++;
                swap(arr, i, low);
            }
        }
        swap(arr, low+1, right);
        return low+1;
    }

    public void swap(int[] arr, int index1, int index2){
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
