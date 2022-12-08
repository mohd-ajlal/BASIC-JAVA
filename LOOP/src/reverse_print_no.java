import java.util.Scanner;

public class reverse_print_no {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter starting no.: ");
        int a = scan.nextInt();
        for (int i = a; i>=1; i--){
            System.out.print(i+" ");
//            i = i-1;
            }
    }
}
