import java.util.Scanner;
public class do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int num = sc.nextInt();
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }while (i<=num);
    }
}
