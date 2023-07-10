// Reverse an array consisting of integers values.

import java.util.Scanner;

public class reverse_array {
    static void array_input(int arr[], int n){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.print("Enter element at index "+i+": ");
            arr[i] = scanner.nextInt();
        }
    }

    static void array_output(int arr[], int n){
        for(int i = 0; i < n; i++){
            System.out.println("Element at index "+i+": "+arr[i]);
        }
    }

    static int[] reverse(int arr[]){
        int ans[] = new int[arr.length];
        for(int i = arr.length - 1, j = 0; i >= 0; i--, j++){
            ans[j] = arr[i];
        }
        return ans;
    }

    static void array_print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println();
        array_input(arr, n);
        System.out.println();
        array_output(arr, n);
        System.out.println();
        int ans[] = reverse(arr);
        array_print(ans);
    }
    
}
