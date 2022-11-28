import java.util.Scanner;

public class cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the cube: ");
        double len = sc.nextDouble();
        double area;
        area = len * len * len;
        System.out.println("The area of the cube is: " + area);
    }
}
