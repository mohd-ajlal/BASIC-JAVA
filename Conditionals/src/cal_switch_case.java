import java.util.Scanner;

public class cal_switch_case {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scan.nextInt();
        System.out.print("Enter b: ");
        int b = scan.nextInt();
        System.out.print("Enter a operator(+, -, *, /):- ");
        String op = scan.next();
        switch (op) {
            case "+":
                System.out.println("a+b :" +(a+b));
                break;
            case "-":
                System.out.println("a-b :"+(a-b));
                break;
            case "*":
                System.out.println("a*b :"+(a*b));
                break;
            case "/":
                System.out.println("a/b :"+(a/b));
                break;
            default:
                System.out.println("Enter valid operator");
        }
    }
}
