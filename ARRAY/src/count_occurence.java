import java.util.Scanner;

public class count_occurence {
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
    static int count_occurence(int arr[], int size, int search){
        int count = 0;
        for(int i = 0; i<size; i++){
            if(arr[i] == search){
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
        System.out.print("Enter the element to be searched: ");
        int search = sc.nextInt();
        int count = count_occurence(arr, size, search);
        System.out.println("The element "+search+" occurs "+count+" times");
    }
}
