package code401challenges;

import java.util.Arrays;

public class ArrayReverse {

  public static int[] reverseArray(int[] incomingArr) {
    int[] outgoingArr = new int[incomingArr.length];
    for(int i = 0; i < incomingArr.length; i++) {
      outgoingArr[outgoingArr.length - i - 1] = incomingArr[i];
    }
    return outgoingArr;
  }

  public static void main(String[] args) {
    int[] arrToReverse = new int[]{2,4,6,8};
    int[] reversedArr = reverseArray(arrToReverse);
    System.out.println("incoming array is");
    System.out.println(Arrays.toString(arrToReverse));
    System.out.println("reversed array is");
    System.out.println(Arrays.toString(reversedArr));
  }
}