package code401challenges.sortInsertion;

public class SortInsertion {

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
}
