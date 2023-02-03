import java.util.Scanner;
public class button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.:");
        int num = sc.nextInt();
        if (num==1){
            System.out.println("Hello");
        } else if (num == 2) {
            System.out.println("Namaste");
        } else if (num == 3) {
            System.out.println("Salam");
        }
        else {
            System.out.println("Invalid input");
        }
    }
}