# Quick Sort
### Author: James Dansie
This is the quick sort algorithm. It begins by picking one element, a pivot, and then putting all the values smaller than it to the left, and all the values larger than it to the right. It then calls that again on the left half and the right half. Each call breaks the left and right half into a smaller and smaller piece until the whole thing is sorted. 
![](https://upload.wikimedia.org/wikipedia/commons/6/6a/Sorting_quicksort_anim.gif)

### Algorithm
1. Pick a pivot
2. Reorder the array so that all values smaller are on the left, and all values larger are on the right.
3. resurively call the reorder function on the left half and right half.

```Java
public class QuickSort {
    public void sort(int [] arr, int left, int right){
        if(left < right){
            int pos = partition(arr, left, right);
            sort(arr, left, pos - 1);
            sort(arr, pos + 1, right);
        }
    }

    public int partition(int[] arr,int left,int right){
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

```
For a video visualizaiton checkout; https://youtu.be/kPRA0W1kECg?t=40

---
## References
* https://en.wikipedia.org/wiki/Quicksort
* https://www.geeksforgeeks.org/quick-sort/