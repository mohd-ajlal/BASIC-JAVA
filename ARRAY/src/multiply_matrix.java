import java.util.Scanner;

public class multiply_matrix {
    static void matrix_input(int arr[][], int rows, int column){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<column; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void matrix_print(int arr[][]){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] matrix_multiply(int arr1[][], int arr2[][]){
        int rows = arr1.length;
        int columns = arr1[0].length;
        int arr3[][] = new int[rows][columns];
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                arr3[i][j] = 0;
                for(int k = 0; k<columns; k++){
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return arr3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row of matrix 1: ");
        int row1 = sc.nextInt();
        System.out.print("Enter column of matrix 1: ");
        int column1 = sc.nextInt();
        int arr1[][] = new int[row1][column1];
        System.out.print("Enter element of matrix 1: ");
        matrix_input(arr1, row1, column1);
        System.out.print("Enter row of matrix 2: ");
        int row2 = sc.nextInt();
        System.out.print("Enter column of matrix 2: ");
        int column2 = sc.nextInt();
        int arr2[][] = new int[row2][column2];
        System.out.print("Enter element of matrix 2: ");
        matrix_input(arr2, row2, column2);
        System.out.println("Matrix 1 is: ");
        matrix_print(arr1);
        System.out.println("Matrix 2 is: ");
        matrix_print(arr2);
        System.out.println("Multiplication of matrix 1 and matrix 2 is: ");
        matrix_print(matrix_multiply(arr1, arr2));
    }
}
