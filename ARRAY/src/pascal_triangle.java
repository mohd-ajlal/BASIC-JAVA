// Given an integer n, return the first row n of the pascal's triangle.
// In pascal's triangle, each number is the sum of two numbers directly above it.

// properties of pascal triangle
// 1. The first and last element of each row is 1.
// 2. Each element in the row is the sum of the elements directly above it.

// Example:
// Input: 5
// Output: [1, 5, 10, 10, 5, 1]

// Input: 3
// Output: [1, 3, 3, 1]

// input: 0
// output: [1]

// Example of pascal triangle
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1

// Solution:
// 1. Create a 2D array of size n x n.
// 2. Initialize the first and last element of each row to 1.
// 3. Iterate through the array and calculate the sum of the elements directly above it.
// 4. Return the first row of the array.

import java.util.Scanner;
public class pascal_triangle {
    static void pascal_triangle(int input){

        int arr[][] = new int[input+1][input+1];
        for(int i = 0; i<=input; i++){
            for(int j = 0; j<=i; j++){
                if(j == 0 || j == i){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }
        for(int i = 0; i<=input; i++){
            System.out.print(arr[input][i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int input = sc.nextInt();
        pascal_triangle(input);
        }
}
