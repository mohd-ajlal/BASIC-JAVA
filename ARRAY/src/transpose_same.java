import java.util.Scanner;

public class transpose_same {
    static void array_input(int arr[][], int rows){
        Scanner sc = new Scanner(System.in);
        for(int  i = 0; i<rows; i++){
            for(int j = 0; j<rows; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void array_output(int arr[][]){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] array_transpose(int arr[][]){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(i<j){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        int arr[][] = new int[rows][rows];
        array_input(arr, rows);
        System.out.println("Array is: ");
        array_output(arr);
        System.out.println("Transpose of array is: ");
        array_output(array_transpose(arr));
    }
}
