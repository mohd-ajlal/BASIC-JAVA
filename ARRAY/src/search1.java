import java.util.Scanner;

class array{
    public int search_i(int arr[], int search){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == search){
                return i;
            }
        }
        return -1;
    }
}

public class search1 {
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
        array searchArray = new array();
        int searchIndex = searchArray.search_i(arr, search);
        if(searchIndex == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at "+searchIndex+" index");
        }
    }
}
