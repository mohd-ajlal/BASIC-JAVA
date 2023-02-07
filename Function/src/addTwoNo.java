import java.util.Scanner;
public class addTwoNo {
    public static int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no.: ");
        int a = sc.nextInt();
        System.out.print("Enter second no.: ");
        int b = sc.nextInt();
        int out = add(a,b);
        System.out.print("Sum is: "+out);
    }
}
