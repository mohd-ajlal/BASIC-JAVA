import java.util.Scanner;

public class product_two_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int product;
        product = a * b;
        System.out.println("The product of " + a + " and " +b+ " is: " + product);
    }
    
}
