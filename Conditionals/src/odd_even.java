import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int num = sc.nextInt();
        String ans;
        ans = (num % 2 == 0)?"even": "odd";
        System.out.println(ans);
    }
}
