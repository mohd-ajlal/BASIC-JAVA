import  java.util.Scanner;
public class primeter_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int len = sc.nextInt();
        System.out.print("Enter breadth: ");
        int bre = sc.nextInt();
        int out = 2 * (len + bre);
        System.out.println("perimeter of rectangle is: " + out);
    }
}
