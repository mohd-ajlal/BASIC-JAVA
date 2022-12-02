import java.util.Scanner;

public class even_divisible_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int num = scan.nextInt();
        if (num%2==0){
            if(num%3 == 0){
                System.out.println("It is even and divisible by 3");
            }else {
                System.out.println("It is even but not divisible by 3.");
            }
        }else {
            System.out.println("No. is odd");
        }
    }
}
