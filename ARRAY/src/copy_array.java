import java.util.Scanner;
public class copy_array {
    static void print_array(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i<size; i++){
            System.out.print("Enter the value of "+i+" index: ");
            arr[i] = sc.nextInt();
        }

        int arr_new[] = arr;
        System.out.println("The new array is: ");
        print_array(arr_new);

        // changing value of arr_new

        arr[0] = 10;
        arr[1] = 15;
        System.out.println("\nOriginal array is after copying and changing value of arr_new: ");
        print_array(arr);
        System.out.println("\nNew array is after copying and changing value of arr_new: ");
        print_array(arr_new);
    }
}
