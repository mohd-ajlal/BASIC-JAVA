//import java.util.*;

public class maximum2dArray {
    static int max(int[][] arr){
        int max = arr[0][0];
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,24,5},
                {42,69, 32},
                {21,54,12}
        };
//        int out = max(arr);
        System.out.println(max(arr));
    }
}
