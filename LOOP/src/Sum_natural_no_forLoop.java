import java.util.Scanner;

public class Sum_natural_no_forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter last natural no.: ");
        int a = scan.nextInt();
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum += i;
        }
        System.out.println("Sum of " + a + " natural no. is " + sum);
    }
}
