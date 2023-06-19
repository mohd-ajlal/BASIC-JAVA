import java.util.Scanner;
public class do_while_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i = 1;
        do{
            System.out.println(num+" x "+i+" = "+num*i);
            i++;
        }while(i<=10);
    }
}
