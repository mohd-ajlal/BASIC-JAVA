// Divisibility Problem : https://codeforces.com/problemset/problem/1328/A

import java.util.Scanner;

public class divisibility_proble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b;
        while (t-- > 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a % b == 0) {
                System.out.println(0);
            } else {
                System.out.println(b - (a % b));
            }
        }
        sc.close();
    }
}
