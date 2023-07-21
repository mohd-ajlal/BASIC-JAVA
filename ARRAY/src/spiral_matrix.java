import java.util.Scanner;

public class spiral_matrix {
    static void array_input(int arr[][], int row, int column){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<row; i++){
            for(int j = 0; j<column; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void array_output(int arr[][], int row, int column){
        for(int i = 0; i<row; i++){
            for(int j = 0; j<column; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void spiral_matrix(int arr[][], int row, int column){
        int top = 0, buttom = row - 1, right = column - 1, left = 0;
        int dir = 0;
        while(top <= buttom && left <= right){
            if(dir == 0){
                for(int i = left; i<=right; i++){
                    System.out.print(arr[top][i]+" ");
                }
                top++;
            }
            else if(dir == 1){
                for(int i = top; i<=buttom; i++){
                    System.out.print(arr[i][right]+" ");
                }
                right--;
            }
            else if(dir == 2){
                for(int i = right; i>=left; i--){
                    System.out.print(arr[buttom][i]+" ");
                }
                buttom--;
            }
            else if(dir == 3){
                for(int i = buttom; i>=top; i--){
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int row = sc.nextInt();
        System.out.print("Enter column number: ");
        int column = sc.nextInt();
        int arr[][] = new int[row][column];
        System.out.println("Enter array elements: ");
        array_input(arr, row, column);
        System.out.println("Array elements are: ");
        array_output(arr, row, column);
        System.out.println("Spiral matrix is: ");
        spiral_matrix(arr, row, column);
    }
}
