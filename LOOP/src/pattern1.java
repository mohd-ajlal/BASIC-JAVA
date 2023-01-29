import java.util.Scanner;
// *
// **
// ***
// ****
// *****
public class pattern1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
    
        int rows = scan.nextInt();
        for (int i = 0; i<rows; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
