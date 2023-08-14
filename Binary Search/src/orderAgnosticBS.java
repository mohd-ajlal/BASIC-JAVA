import java.util.Scanner;

public class orderAgnosticBS {
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(arr[0]>arr[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > arr[start] || target < arr[end]) {
                    return -1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }else{
            while(start<=end){
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
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {9,8,7,6,5,4,3,2,1,0};
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        int out = BinarySearch(array, target);
        if(out == -1){
            System.out.print("Not found");
        }else {
            System.out.println("Found. Index No.: "+out);
        }
    }
}
