import java.util.Scanner;

public class input_string {
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        System.out.print("Enter a string: ");
//        Want more than one word or a string
        String string1 = name.nextLine();
        System.out.println("String is: "+ string1);

    }
}
