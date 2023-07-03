import java.util.Scanner;

public class strictly_greater_than_value {
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
    static int greater(int arr[], int size, int num){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > num){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        array_input(arr, size);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        int count = greater(arr, size, num);
        if(count == 0){
            System.out.println("No element is strictly greater than "+num);
        }
        else{
            System.out.println("The number of elements strictly greater than "+num+" is "+count);
        }
    }
}
