import java.util.Scanner;

public class caltulating_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long out = (n + 1) / 2 * (((n & 1) == 1) ? -1 : 1);
        System.out.println(out);
    }
}
