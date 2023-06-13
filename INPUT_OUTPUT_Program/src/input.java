import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Scanner class is used to take input from the user
        // System.in is used to take input from the keyboard

        // nextLine() is used to take input as a string
        // next() is used to take input as a single word
        // nextInt() is used to take input as a integer
        // nextFloat() is used to take input as a float
        // nextDouble() is used to take input as a double
        // nextBoolean() is used to take input as a boolean
        // nextByte() is used to take input as a byte
        // nextLong() is used to take input as a long
        // nextShort() is used to take input as a short
        // nextChar() is used to take input as a char


        System.out.println("My name is: " + name);
    }
}