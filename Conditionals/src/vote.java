import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can't vote");
        }
    }
}
