// Given a positive integer n, generate an n*n matrix filled with elements from 1 to n^2 in spiral order.


import java.util.Scanner;

public class spiral_matrix_problem {

    static int[][] generate_spiral_matrix(int size){
        int top = 0, buttom = size - 1, right = size - 1, left = 0;
        int dir = 0, count = 1;
        int arr[][] = new int[size][size];
        while(top <= buttom && left <= right){
            if(dir == 0){
                for(int i = left; i<=right; i++){
                    arr[top][i] = count++;
                }
                top++;
            }
            else if(dir == 1){
                for(int i = top; i<=buttom; i++){
                    arr[i][right] = count++;
                }
                right--;
            }
            else if(dir == 2){
                for(int i = right; i>=left; i--){
                    arr[buttom][i] = count++;
                }
                buttom--;
            }
            else if(dir == 3){
                for(int i = buttom; i>=top; i--){
                    arr[i][left] = count++;
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int size = sc.nextInt();
        int arr[][] = generate_spiral_matrix(size);
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
