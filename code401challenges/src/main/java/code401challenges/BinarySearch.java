package code401challenges;

public class BinarySearch {
    public static int binarySearch(int[] arrIn, int key){
        int lower = 0;
        int upper = arrIn.length - 1;
        while(lower <= upper){
            int mid = (lower + upper)/2;

            String out = String.format("Lower is %d Upper is %d Mid is %d", lower, upper, mid);
            System.out.println(out);

            if(arrIn[mid] == key){
                return mid;
            } else if(key > arrIn[mid]){
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }

        }
        return -1;
    }
}
