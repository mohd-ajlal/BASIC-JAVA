import java.util.Scanner;

public class acsii_value {
   public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            System.out.print("Enter the character: ");
            char ch = sc.next().charAt(0);
            
         int ascii = ch;
         int castAscii = (int) ch;
         System.out.println("The ASCII value of " + ch + " is: " + ascii);
         System.out.println("The ASCII value of " + ch + " is: " + castAscii);
   } 
}
