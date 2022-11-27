import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num_1 = name.nextInt();

        System.out.println("Entered number by user is " + num_1);

        System.out.print("Enter your name: ");
        String name1 = name.next();
//        Give output only one word.

        System.out.println("Name is "+ name1);
    }
}
