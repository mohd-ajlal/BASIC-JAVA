import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Calculate Simple Interest");
        System.out.print("Enter principle: ");
        int p = name.nextInt();
        System.out.print("Enter rate: ");
        float r = name.nextFloat();
        System.out.print("Enter time in years: ");
        int t = name.nextInt();
        float si;
        si = (p*r*t) / 100;
        System.out.println("princile is "+p);
        System.out.println("Rate is " +r);
        System.out.println("Time is "+t);
        System.out.println("Simple Interest is " +si);
    }
}
