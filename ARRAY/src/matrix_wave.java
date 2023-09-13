import java.util.Scanner;

public class matrix_wave {
    static void array_input(int arr[][], int rows,int col){
        Scanner sc = new Scanner(System.in);
        for(int  i = 0; i<rows; i++){
            for(int j = 0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void array_wave(int arr[][], int rows, int cols){
        for(int i = 0; i<cols; i++){
                if(i%2==0){
                    for(int j = 0; j<rows; j++){ 
                    System.out.print(arr[j][i]+" ");
                    }
                }else{
                    for(int j = rows-1; j>=0; j--){
                        System.out.print(arr[j][i]+" ");
                    }
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


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and cols: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        array_input(arr, rows, cols);
        System.out.println("Transpose of array is: ");
        array_wave(arr, rows, cols);
    }
}