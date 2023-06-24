import java.util.Scanner;

public class add_m {

    static int sum(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.println("Sum is: "+sum(a, b));       
    }
}
