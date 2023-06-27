import java.util.Scanner;
public class sum_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Enter the value of "+i+" index: ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += arr[i];
        }
        System.out.println("Sum of array is: " + sum);
    }
}
