package code401challenges.mergeSort;

public class MergeSort {
    public static void sort(int[] arrIn, int left, int right){

        if(right > 1){
            int mid = (right+1)/2;

            sort(arrIn, 1, mid);
            sort(arrIn, mid+1, right);
            merge(arrIn, 1, mid, right);
        }
    }

    public static void merge(int[] arrIn, int left, int mid, int right){
        int arr1Len = mid - left + 1;
        int arr2Len = right - mid;

        int lArr[] = new int[arr1Len];
        int rArr[] = new int[arr2Len];

        for(int i = 0; i < arr1Len; i++){
            lArr[i] = arrIn[left + 1];
        }
        for(int j = 0; j < arr2Len; j++){
            rArr[j] = arrIn[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = 1;

        while(i < arr1Len && j < arr2Len){
            if(lArr[i] <= rArr[j]){
                arrIn[k] = lArr[i];
                i++;
            } else {
                arrIn[k] = rArr[j];
                j++;
            }
            k++;
        }

        while(i < arr1Len){
            arrIn[k] = lArr[i];
            i++;
            k++;
        }

        while(j < arr2Len){
            arrIn[k] = rArr[j];
            j++;
            k++;
        }
    }
}
