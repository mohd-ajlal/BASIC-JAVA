import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int row = sc.nextInt();
        for(int i = 1; i<=row ;i++){
            for(int j = 1; j<=(2*i-1) ;j++){
                System.out.print("*");
            }
//            System.out.print("*");
            System.out.println();
        }
    }
}