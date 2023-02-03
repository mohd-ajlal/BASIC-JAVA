import java.util.Scanner;

public class greater_in_3_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        if(a >=b && a >=c){
            System.out.println("Greatest no. is "+a);
        }
        else if(b>=a && b >=c ){
            System.out.println("Greatest no. is "+b);
        }
        else {
            System.out.println("Greatest no. is "+c);
        }
    }
}
