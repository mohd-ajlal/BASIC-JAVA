import java.util.Scanner;
public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();
        for(int i = 1; i<=rows; i++){
            for(int j = i; j<=rows ; j++){
                System.out.print(j);
            }
            for(int k = 1; k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
