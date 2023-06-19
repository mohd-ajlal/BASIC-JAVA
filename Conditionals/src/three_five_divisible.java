import java.util.Scanner;

public class three_five_divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num%3==0){
            if(num%5==0){
                System.out.println("Divisible by both 3 and 5");
            }
            else{
                System.out.println("Divisible by 3 only");
            }
        }
        else{
            if(num%5==0){
                System.out.println("Divisible by 5 only");
            }
            else{
                System.out.println("Not divisible by both 3 and 5");
            }
        }
    }
}
