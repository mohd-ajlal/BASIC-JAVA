import java.util.Scanner;
public class a_pow_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        int s = 1;
        for(int i = 1; i<=b; i++){
            s = s *a;
        }
        System.out.println("a to the power b is: "+s);
    }
}
