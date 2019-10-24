# Merge Sort
### Author: James Dansie

Merge sorts work by breaking down larger arrays and then sort them in smaller arrays. These smaller arrays are then used to build up larger arrays and sort as they go.

![](https://upload.wikimedia.org/wikipedia/commons/c/cc/Merge-sort-example-300px.gif)

### Algorithm
1. Break the array up into sub arrays, 1 length long.
2. Merge the sub arrays together while ordering them from smallest to largest.
### Code
```Java
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
```
---
### References
* https://www.geeksforgeeks.org/merge-sort/
* https://en.wikipedia.org/wiki/Merge_sort