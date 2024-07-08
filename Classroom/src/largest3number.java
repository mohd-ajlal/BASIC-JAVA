import java.util.Arrays;

public class largest3number {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,6,5,9};
        Arrays.sort(arr);
        int len = arr.length;
//        int first = ;
//        int second = ;
//        int third = ;
        System.out.println(arr[len-1] + " " + arr[len-2] + " " + arr[len-3]);
    }
}
