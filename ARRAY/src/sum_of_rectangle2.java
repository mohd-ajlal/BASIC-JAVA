// Given a matrix 'a' of dimension n x m and  two coordinate (l1, r1) and (l2 , r2). Return the sum of retangle from (l1, r1) to (l2 , r2)
// l2>=l1 , r2 >= r1
// n = row (r)
// m = column(c)

// Pre calculate the horizontal sum of each row in the matrix

import java.util.Scanner;

public class sum_of_rectangle2 {
    static void array_input(int arr[][], int row, int column){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<row; i++){
            for(int j = 0; j<column; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void array_input(int arr[][]){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
