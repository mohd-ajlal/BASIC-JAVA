// Check if we can partition the  array in two subarrays with equal sum. 
// More formally, check that the prefix sum of a apart of a array is equal to the suffix sum of rest of the array.  

import java.util.Scanner;

public class two_pointer_equal_sum_subarray {
    static void array_input(int arr[], int size){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
    }

    static void print_array(int arr[], int ans[]){
        for(int i = 0; i<ans[0]; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.print("|| ");

        for(int i = ans[1] + 1; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static int[] check_sum(int arr[]){
        int left = 0, right = arr.length-1;
        int left_sum = 0, right_sum = 0;
        while(left<=right){
            if(left_sum<right_sum){
                left_sum += arr[left];
                left++;
            }
            else{
                right_sum += arr[right];
                right--;
            }
        }
        if(left_sum == right_sum){
            int ans[] = {left, right};
            return ans;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter array elements: ");
        array_input(arr, size);
        System.out.println();
        int arr1[] = new int[size];
        int ans[] = check_sum(arr);
        if(ans == null){
            System.out.println("Not possible");
        }
        else{
            System.out.println("Possible");
            print_array(arr, ans);

        }
    }
}
