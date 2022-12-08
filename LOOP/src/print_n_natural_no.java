import java.util.Scanner;

public class print_n_natural_no {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter end no. : ");
        int n = scan.nextInt();
        int a = 1;
        while (a<=n){
            System.out.print(a+ " ");
            a++;
        }

    }
}
