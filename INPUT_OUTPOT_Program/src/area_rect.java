import java.util.Scanner;

public class area_rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        double area;
        area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }
}
