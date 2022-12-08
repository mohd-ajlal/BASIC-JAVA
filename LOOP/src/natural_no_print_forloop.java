import java.util.Scanner;

public class natural_no_print_forloop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter last no.: ");
        int a = scan.nextInt();
        for (int i = 1; i<=a; i++){
            System.out.print(i+" ");

        }
    }
}
