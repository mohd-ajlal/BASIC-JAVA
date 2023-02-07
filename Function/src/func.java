//print a given name in a function
import java.util.Scanner;
public class func {
    public static void printMyName(String name){
        System.out.println("Your name is "+ name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        printMyName(name); //call the function

    }
}
