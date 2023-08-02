// Sum of rectangle using brute force algorithm.
// Given a matrix 'a' of dimension n x m and  two coordinate (l1, r1) and (l2 , r2). Return the sum of retangle from (l1, r1) to (l2 , r2)
// l2>=l1 , r2 >= r1
// n = row (r)
// m = column(c)

import java.util.Scanner;

public class sum_of_rectangle1 {
    static void array_input(int arr[][],  int row , int column){
        Scanner sc  =new Scanner(System.in);
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void array_output(int arr[][],  int row , int column){
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int array_sum(int arr[][], int r1, int r2, int c1, int c2){
        int sum = 0;
        for(int i = r1 ; i <= r2 ; i++){
            for(int j = c1 ; j <= c2 ; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and column: ");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int arr[][] = new int[row][column];
        array_input(arr, row, column);
        System.out.println("Array is: ");
        array_output(arr, row, column);
        System.out.print("Enter row1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter row2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter column1: ");
        int c1 = sc.nextInt();
        System.out.print("Enter column2: ");
        int c2 = sc.nextInt();

        System.out.println(array_sum(arr, r1, r2, c1, c2));
    }
}
