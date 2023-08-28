import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int out = 1;
        for(int i = 0; i<rows; i++) {
            for(int j = 0;j<=i; j++){
                System.out.print(out + " ");
                out++;
            }
            System.out.println();
        }
    }
}
