import java.util.Scanner;

public class input_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int out = a+b;
        System.out.println("Sum of a and b is: "+ out);
    }
}
