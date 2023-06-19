import java.util.Scanner;
public class number_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter a number: ");
        int num3 = sc.nextInt();
        if(num1>num2){
            if(num1>num3){
                System.out.println(num1+" is largest");
            }
            else{
                System.out.println(num3+" is largest");
            }
        }
        else{
            if(num2>num3){
                System.out.println(num2+" is largest");
            }
            else{
                System.out.println(num3+" is largest");
            }
        }
    }
}
