//package code401challenges.mergeSort;
//
//import java.util.Arrays;
//
//public class MergeSort {
//    public static int[] sort(int[] arrIn){
//        int n  = arrIn.length;
//        if(n > 1){
//            int mid = n/2;
//            int[] left = Arrays.copyOfRange(arrIn, 0, mid);
//            int[] right = Arrays.copyOfRange(arrIn, mid, n);
//            int[] leftback = sort(left);
//            int[] rightback = sort(right);
//            merge(leftback, rightback, arrIn);
//        } else {
//            return arrIn;
//        }
//    }
//
//    public static void merge(int[] arrIn, int left, int mid, int right){
//        int arr1Len = mid - left + 1;
//        int arr2Len = right - mid;
//
//        int lArr[] = new int[arr1Len];
//        int rArr[] = new int[arr2Len];
//
//        for(int i = 0; i < arr1Len; i++){
//            lArr[i] = arrIn[left + i];
//        }
//        for(int j = 0; j < arr2Len; j++){
//            rArr[j] = arrIn[mid + 1 + j];
//        }
//
//        int i = 0;
//        int j = 0;
//        int k = 1;
//
//        while(i < arr1Len && j < arr2Len){
//            if(lArr[i] <= rArr[j]){
//                arrIn[k] = lArr[i];
//                i++;
//            } else {
//                arrIn[k] = rArr[j];
//                j++;
//            }
//            k++;
//        }
//
//        while(i < arr1Len){
//            arrIn[k] = lArr[i];
//            i++;
//            k++;
//        }
//
//        while(j < arr2Len){
//            arrIn[k] = rArr[j];
//            j++;
//            k++;
//        }
//    }
//}
