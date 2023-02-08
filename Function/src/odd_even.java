import java.util.Scanner;
public class odd_even {
    public static void oddEven(int num){
        if(num%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int num= sc.nextInt();
        oddEven(num);
    }
}
