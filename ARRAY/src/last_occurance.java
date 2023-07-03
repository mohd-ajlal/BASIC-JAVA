import java.util.Scanner;

public class last_occurance {
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

    static int last_occur(int arr[], int x){
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        array_input(arr, size);
        System.out.print("Enter the element to be searched: ");
        int search = sc.nextInt();
        int last = last_occur(arr, search);
        if(last == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("The last occurance of "+search+" is at index "+last);
        }
    }
}