import java.util.Scanner;

public class add_matrix {
    static void matrix_input(int arr[][], int rows, int columns){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<rows; i++){
            for(int j= 0; j<columns; j++){
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

    static int[][] matrix_add(int mat1[][], int matrix2[][]){
        if(mat1.length != matrix2.length || mat1[0].length != matrix2[0].length){
            System.out.println("Addition not possible");
            return null;
        }else{
            int rows = mat1.length;
            int columns = mat1[0].length;
            int result[][] = new int[rows][columns];
            for(int i = 0; i<rows; i++){
                for(int j = 0; j<columns; j++){
                    result[i][j] = mat1[i][j] + matrix2[i][j];
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int columns = sc.nextInt();
        int mat1[][] = new int[rows][columns];
        int mat2[][] = new int[rows][columns];
        System.out.println("Enter matrix 1: ");
        matrix_input(mat1, rows, columns);
        System.out.println("Enter matrix 2: ");
        matrix_input(mat2, rows, columns);
        System.out.println("Matrix 1 is: ");
        matrix_print(mat1);
        System.out.println("Matrix 2 is: ");
        matrix_print(mat2);
        System.out.println("Addition of matrix 1 and matrix 2 is: ");
        matrix_print(matrix_add(mat1, mat2));
    }
}
