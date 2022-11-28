import java.util.Scanner;

public class Read_Character {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter a word: ");
        char ch = name.next().charAt(0);
        System.out.println("First Character is "+ch);

    }
}
