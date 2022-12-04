import java.util.Scanner;

public class absolute_value {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int a = scan.nextInt();
        if (a>=0){
            System.out.println(a);
        }
        else {
            System.out.println(a * (-1));
        }
    }
}
