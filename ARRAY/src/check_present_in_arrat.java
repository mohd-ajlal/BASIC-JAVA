import java.util.Scanner;

public class check_present_in_arrat {
    static void array_imput(int arr[], int size){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
    }

    static void array_output(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static boolean check_present(int arr[],int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter array elements: ");
        array_imput(arr, size);
        System.out.println();
        System.out.println("Enter no. of query: ");
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            System.out.println("Enter no. to check: ");
            int num = sc.nextInt();
            if(check_present(arr,num)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
