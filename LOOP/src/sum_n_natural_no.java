import java.util.Scanner;

public class sum_n_natural_no
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int num = scan.nextInt();
        int i = 1;
        int sum = 0;
        while (i<=num){
            sum += i;
            i +=1;
        }
        System.out.println("Sum of "+num+" natural no. is " +sum);

    }
}
