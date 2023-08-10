import java.util.*;

public class SearchInRange {

    static boolean search(int arr[], int target, int low, int high){
        for(int i = low; i<=high; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,4,5,6,-1,-3,4,-2,-223,23};
        System.out.print("Enter element to be search: ");
        int target = sc.nextInt();
        System.out.print("Enter lowest and highest index followed by space: ");
        int low = sc.nextInt();
        int high = sc.nextInt();
        System.out.print(search(arr, target, low, high));
    }
}
