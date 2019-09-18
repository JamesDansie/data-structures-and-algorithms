package code401challenges;

public class ArrayShift {
    //code challenge 02 goes here
    public static int[] insertShiftArray(int[] arrIn, int numAdded){
        int[] arrOut = new int[(arrIn.length + 1)];
        int mid = arrOut.length/2;
        for(int i = 0; i < arrOut.length; i++) {
            if(i < mid){
                arrOut[i] = arrIn[i];
            } else if(i == mid){
                arrOut[i] = numAdded;
            } else {
                arrOut[i] = arrIn[i-1];
            }
        }
        return arrOut;
    }
}
