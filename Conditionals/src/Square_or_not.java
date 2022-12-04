import java.util.Scanner;

public class Square_or_not {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length: ");
        int len = scan.nextInt();
        System.out.print("Enter breadth: ");
        int bre = scan.nextInt();
        if (len == bre){
            System.out.println("It is a square");
        }
        else {
            System.out.println("It is a rectangle");
        }
    }
}
