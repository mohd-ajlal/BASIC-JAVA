import java.util.Scanner;

public class sorted_or_not {
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
    static boolean is_sorted(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    static int[] smallest_and_LargestElement(int arr[]){
        int smallest = arr[0];
        int largest = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        int ans[] = {smallest, largest};
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        array_input(arr, size);
        boolean sorted = is_sorted(arr);
        if(sorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }

        int ans[] = smallest_and_LargestElement(arr);
        print_array(ans);
    }
}
