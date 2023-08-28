import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            int out = a + b;
            a = b;
            b = out;
        }
        System.out.println(a);
    }
}
