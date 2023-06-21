import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        int i = 1;
        int result = 1;
        for(i = 1; i<=b; i++){
            result = result * a;
        }
        System.out.println(a+"^"+b+" = "+result);
    }
}