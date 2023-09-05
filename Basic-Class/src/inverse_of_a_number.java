import java.util.Scanner;

public class inverse_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int length = (int)Math.floor(Math.log10(num)+1);
        int out = 0;
        for(int i = 1; i<=length; i++) {
            int digit = num%10;
            out += i*Math.pow(10, digit-1);
            num /= 10;
        }
        System.out.println(out);
    }
}
