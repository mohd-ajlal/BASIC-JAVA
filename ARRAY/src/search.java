import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Enter the value of "+i+" index: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int search = sc.nextInt();
        for(int i = 0; i<search; i++){
            if(arr[i] == search){
                System.out.print("Element found at "+i+" index");
                break;
            }
        }
    }
}
