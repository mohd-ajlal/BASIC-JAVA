import java.util.Scanner;

public class ascii_value_2 {
    public static void main(String[] strings) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);

        int asc = ch;
        System.out.println("The ASCII value of " + (char) ch + " is: " + asc);
        
    }
}