import java.util.Scanner;

public class if_operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a no. :");
        int a = scan.nextInt();
        if (a == 1){
            System.out.println("It is one");
        } else if (a == 2) {
            System.out.println("it is 2");
        }
        else {
            System.out.println("is is neither 1 nor 2");
        }
    }
}
