import java.util.*;

public class minimum_number {
//    assume arr.length is not equal to 0.
//    return minimum value of the array.
    static int minimun(int[] arr){
        int first = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<first){
                first = arr[i];
            }
        }
        return first;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,4,5,6,7,132};
        int out = minimun(arr);
        System.out.print("Minimum value is: "+ out);
    }
}
