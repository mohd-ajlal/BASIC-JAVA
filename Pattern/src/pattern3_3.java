import java.util.Scanner;
public class pattern3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<rows-1; i++){
            for(int j=0; j<rows-i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}