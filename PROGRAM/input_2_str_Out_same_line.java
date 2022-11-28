import java.util.Scanner;
public class input_2_str_Out_same_line {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String name1 = name.nextLine();
        System.out.println("Enter second string: ");
        String name2 = name.nextLine();
        System.out.println(name1 + " " +name2);
    }
}