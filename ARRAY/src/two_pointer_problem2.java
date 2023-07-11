//  For an array 'a' sorted in non-decreasing order, return an array of squares of each number sorted in non-decreasing order

import java.util.*;

public class two_pointer_problem2 {
    static void array_input(int arr[], int size){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
    }

    static void print_array(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void sort(int arr[]){
        //  For an array 'a' sorted in non-decreasing order, return an array of squares of each number sorted in non-decreasing order

        int left = 0;
        int right = arr.length-1;
        int temp[] = new int[arr.length];
        int index = arr.length-1;
        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                temp[index] = arr[left] * arr[left];
                left++;
            }
            else{
                temp[index] = arr[right] * arr[right];
                right--;
            }
            index--;
        }
        for(int i = 0; i<arr.length; i++){
            arr[i] = temp[i];
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
        sort(arr);
        print_array(arr);
    }
}
