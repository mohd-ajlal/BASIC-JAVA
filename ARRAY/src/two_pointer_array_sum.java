import java.util.Scanner;

public class two_pointer_array_sum {
    static void array_input(int arr[], int size){
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<=size; i++){
            arr[i] = sc.nextInt();
        }
    }

    static void print_array(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static int[] prefix_sum(int arr[]){
        // int add = 0;
        for(int i = 1; i < arr.length; i++){
            arr[i] += arr[i-1];
            // add = arr[i];
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size + 1];
        System.out.print("Enter array elements: ");
        array_input(arr, size);
        System.out.println();
        int prefSum[] = prefix_sum(arr);
        System.out.print("Enter no. of queries: ");
        int q = sc.nextInt();
        while(q-- >0){
            System.out.print("Enter left index: ");
            int l = sc.nextInt();
            System.out.print("Enter right index: ");
            int r = sc.nextInt();
            int ans = prefSum[r] - prefSum[l-1];
            System.out.println(ans);
        }
    }
}