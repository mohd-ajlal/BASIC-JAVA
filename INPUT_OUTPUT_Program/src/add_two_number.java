import java.util.Scanner;

public class add_two_number {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("Enter first no.: ");
        int num1 = name.nextInt();
        System.out.print("Enter second no.: ");
        int num2 = name.nextInt();
        int sum;
        sum = num1 + num2;
        System.out.println("Sum of " +num1+ " and " +num2+ " is " +sum );
    }
}
