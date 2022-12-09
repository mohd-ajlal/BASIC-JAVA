import java.util.Scanner;

public class break_statement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a no.: ");
//        int num = scan.nextInt();
        for (int num =1; num<=10; num++){
            if (num==5){
                break;
            }
            System.out.println(num);
        }
    }
}
