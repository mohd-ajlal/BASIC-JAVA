import java.util.Scanner;

public class BinarySearch {

//    return the index
//    return -1 if it doesn't exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start<=end){
//            find the middle element
//            int middle = (start + end) /2;   // might be possible that (start + end) excess the range of int in java

            int mid = start + (end - start)/2;
            if(target<arr[start] || target > arr[end]){
                return -1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.print("Enter element to be search: ");
        int target = sc.nextInt();
        int out = binarySearch(array, target);
        if(out== -1){
            System.out.println("Not Find.");
        }else{
            System.out.println("find. Index = " + out);
        }
    }
}
