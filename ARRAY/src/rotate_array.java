import java.util.Scanner;

public class rotate_array {
    static void array_input(int array[], int size){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < size; i++){
            // System.out.print("Enter element at index "+i+": ");
            array[i] = sc.nextInt();
        }
    }

    static void array_output(int array[]){
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    static void swap(int arr[], int i, int j){
        int temp = arr[i]; 
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void rotate_array(int arr[], int k){
        // for(int i = 0; i < k; i++){
        //     int temp = array[array.length - 1]; 
        //     for(int j = array.length - 1; j > 0; j--){ 
        //         array[j] = array[j - 1];
        //     }
        //     array[0] = temp;
        // }
        // return array;

        k %= arr.length;
            rotate(arr, 0, arr.length-1);
            rotate(arr, 0, k-1);
            rotate(arr, k, arr.length-1);
        }

        static void rotate(int[] arr, int start, int end){
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println();
        array_input(array, size);
        System.out.println();
        array_output(array);
        System.out.println();
        System.out.print("Enter number of rotations: ");
        int k = sc.nextInt();
        rotate_array(array, k);
        array_output(array);   
    }
}