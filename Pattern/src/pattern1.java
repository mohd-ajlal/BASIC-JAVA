import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int row = sc.nextInt();
        for(int i = 1; i<=row ;i++){
            for(int j= 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}