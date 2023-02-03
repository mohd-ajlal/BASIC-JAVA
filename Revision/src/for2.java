import java.util.Scanner;
public class for2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows = sc.nextInt();
        for(int i= 0; i<rows; i = i+1){
            for(int j = 0; j<=i; j = j+1){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
