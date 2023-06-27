import java.util.Scanner;
public class clone {
    static void array_input(int arr[], int size){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<size; i++){
            System.out.print("Enter the value of "+i+" index: ");
            arr[i] = sc.nextInt();
        }
    }
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
        array_input(arr, size);
        int arr_new[] = arr.clone();
        System.out.println("The new array is: ");
        print_array(arr_new);
    }    
}
