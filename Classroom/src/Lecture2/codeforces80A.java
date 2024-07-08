package Lecture2;
import java.util.Scanner;

public class codeforces80A {


        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int m = input.nextInt();

            int nextPrime = n + 1;
            while (!isPrime(nextPrime)) {
                nextPrime++;
            }

            if (m == nextPrime) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            input.close();
        }

}
