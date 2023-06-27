import java.util.Scanner;
public class max_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i<size; i++){
            System.out.print("Enter the value of "+i+" index: ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i<size-1; i++){
            if(arr[i]>arr[i+1]){
                max = arr[i];
            }
            else{
                max = arr[i+1];
            }
        }
        System.out.println("Maximum value of array is: " + max);
    }
}
