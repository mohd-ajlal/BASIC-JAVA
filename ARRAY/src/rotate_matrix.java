import java.util.Scanner;

public class rotate_matrix {
    static void matrix_input(int[][] arr, int size){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void print_matrix(int arr[][]){
        for(int i = 0; i<arr.length; i++){
            for(int  j = 0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] matrix_transpose(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }

    static int[] array_reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
        return arr;
    }

    static int[][] rotate(int arr[][]){
        matrix_transpose(arr);
        for(int i = 0; i<arr.length; i++){
            array_reverse(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int size = sc.nextInt();
        int arr[][] = new int[size][size];
        System.out.println("Enter elements of matrix: ");
        matrix_input(arr, size);
        System.out.println("Matrix is: ");
        print_matrix(arr);
        System.out.println("Times to rotate: ");
        int times = sc.nextInt();
        for(int i = 0; i<times; i++){
            rotate(arr);
        }
        System.out.println("Matrix after rotation: ");
        print_matrix(arr);
    }    
}
