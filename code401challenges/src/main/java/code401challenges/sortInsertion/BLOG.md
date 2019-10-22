# Insert Sort
### Author: James Dansie
This is the insertion sort algorithm. It begins by picking one element and then comparing it with the previously sorted elements until it finds the correct position. 
![](https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif)

### Algorithm
1. Make a function that accepts an array of ints as input
2. use a for loop to go through each element from the front forward
3. store the current value in a temporary variable
4. use a while loop to sort from the back to the front until it find where the array is smaller than the tmp variable

```Java
public static int[] InsertionSort(int[] arrIn){
    for(int i = 1; i < arrIn.length; i++){
        int j = i - 1;
        int temp = arrIn[i];

        while(j >= 0 && temp < arrIn[j]){
            arrIn[j + 1] = arrIn[j];
            j--;
        }

        arrIn[j + 1] = temp;
    }

    return arrIn;
}
```
For a video visualizaiton checkout; https://youtu.be/kPRA0W1kECg?t=10

![](https://youtu.be/kPRA0W1kECg?t=10)

<a href="http://www.youtube.com/watch?feature=player_embedded&v=kPRA0W1kECg&t=10s
" target="_blank"><img src="http://img.youtube.com/vi/kPRA0W1kECg&t=10s/0.jpg" 
alt="IMAGE ALT TEXT HERE" width="240" height="180" border="10" /></a>

[![IMAGE ALT TEXT HERE](http://img.youtube.com/vi/kPRA0W1kECg&t=10s/0.jpg)](http://www.youtube.com/watch?v=kPRA0W1kECg&t=277s)

---
## References
* https://en.wikipedia.org/wiki/Insertion_sort
* https://www.geeksforgeeks.org/insertion-sort/
