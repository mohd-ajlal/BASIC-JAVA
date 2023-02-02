import java.util.Scanner;
//import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc1.next();
        System.out.println(name);
        System.out.print("Enter full name: ");
        String full = sc2.nextLine();
//        nextInt()
//        nextFloat()
//        as so on...
        System.out.println(full);
    }
}
