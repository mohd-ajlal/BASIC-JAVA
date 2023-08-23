import java.util.Scanner;

public class drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double out = 0;
        for(int i = 0; i < n; i++) {
            double c = sc.nextDouble();
            out += c;
        }
        double ans = out/n;
        System.out.println(ans);
    }
}
