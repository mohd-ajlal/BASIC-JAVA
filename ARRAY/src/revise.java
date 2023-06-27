import java.util.Scanner;

public class revise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Enter the value of "+i+" index: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Using for loop...");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Using for each loop...");

        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Using while loop...");

        int i = 0;
        while(i<n){
            System.out.print(arr[i] + " ");
            i++;
        }
    }
}
