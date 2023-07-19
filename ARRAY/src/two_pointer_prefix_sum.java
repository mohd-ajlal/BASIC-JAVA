// Given an array integer 'a', rerturn the prefix sum/running sum in the same array without creating a new array.

import java.util.Scanner;

public class two_pointer_prefix_sum {
    static void array_input(int arr[], int size){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
    }

    static void print_array(int arr[]){
        for(int i = 0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void prefix_sum(int arr[]){
        // int add = 0;
        for(int i = 1; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
            // add = arr[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter array elements: ");
        array_input(arr, size);
        System.out.println();
        prefix_sum(arr);
        print_array(arr);        
    }
}
