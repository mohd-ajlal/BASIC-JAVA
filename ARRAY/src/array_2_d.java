import java.util.Scanner;
public class array_2_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print("Enter the value of "+i+" "+j+" index: ");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
