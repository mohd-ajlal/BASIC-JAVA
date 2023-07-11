import java.util.Scanner;

public class two_pointer_sort1 {
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

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    
    static void sort(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            while(arr[left]==0 && left<right){
                left++;
            }
            while(arr[right]==1 && left<right){
                right--;
            }
            if(left<right){
                swap(arr, left, right);
                left++;
                right--;
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
        sort(arr);
        print_array(arr);
    }
}
