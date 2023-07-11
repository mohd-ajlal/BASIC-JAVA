// Sort an array consisting of 0 and 1 only

import java.util.Scanner;

public class two_pointer_sort {
    static void array_input(int arr[], int size){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
    }

    static void print_array(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void sort_array(int arr[]){
        int zeros = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                zeros++;
            }
        }
        for(int  i =0; i<arr.length; i++){
            if(i<zeros){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter array elements: ");
        array_input(arr, size);
        System.out.println();
        sort_array(arr);
        print_array(arr);
        
    }
}
