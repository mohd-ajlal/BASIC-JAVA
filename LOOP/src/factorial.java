import java.util.Scanner;

import javax.xml.transform.Source;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextInt();
        long fact = 1;
        for(int i = 1; i<=num; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}
