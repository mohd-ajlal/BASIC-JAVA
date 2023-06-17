import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of a rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of a rectangle: ");
        int breadth = sc.nextInt();
        int area = length * breadth;

        System.out.println("Arrea of rectangle = " + area);
    }
}
