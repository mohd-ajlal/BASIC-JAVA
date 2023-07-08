import java.util.Scanner;

public class target_sum_triplets {

    static void array_input(int arr[], int size){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<size; i++){
            System.out.print("Enter the value of "+i+" index: ");
            arr[i] = sc.nextInt();
        }
    }

    static void print_array(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void triplets(int arr[], int target){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                for(int k = j+1; k<arr.length; k++){
                    if(arr[i]+arr[j]+arr[k] == target){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        count++;
                    }
                }
            }
        }
        if(count == 0){
            System.out.println("No triplet of elements whose sum is equal to target");
        }else{
            System.out.println("The number of triplets of elements whose sum is equal to target is: "+count);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        array_input(arr, size);
        System.out.print("Enter the value of target: ");
        int target = sc.nextInt();
        triplets(arr, target);
    }
}
