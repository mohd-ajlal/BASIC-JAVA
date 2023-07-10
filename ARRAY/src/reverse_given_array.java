import java.util.Scanner;

public class reverse_given_array {
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

    static int[] reverse(int arr[]){
        int temp = arr.length - 1;
        for(int i = 0; i<arr.length/2; i++){
            int t = arr[i];
            arr[i] = arr[temp];
            arr[temp] = t;
            temp--;
        }
        return arr;
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
        int ans[] = reverse(arr);
        array_output(ans);
    }
}
