// Rotate the given array by 'k' steps, where 'k' is a non-negative integer.
// Note: k can be greater than the size of the array.

import java.util.Scanner;

public class rotate_rray {

    static void array_input(int arr[], int size){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < size; i++){
            System.out.print("Enter element at index "+i+": ");
            arr[i] = sc.nextInt();
        }
    }

    static void array_output(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


    static int[] rotate(int arr[], int k){
        int ans[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            ans[(i+k)%arr.length] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println();
        array_input(arr, size);
        System.out.println();
        array_output(arr);
        System.out.println();
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        int ans[] = rotate(arr, k);
        array_output(ans);
    }
}
