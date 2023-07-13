import java.util.Scanner;

public class array2D_input {
    static void array_input(int arr[][], int row, int column){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<row; i++){
            for(int j = 0; j<column; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void  print_array(int arr[][]){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter column: ");
        int column = sc.nextInt();
        int arr[][] = new int[row][column];
        array_input(arr, row, column);
        System.out.println("Array is: ");
        print_array(arr);
    }
}
