import java.util.Scanner;
public class button2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Salam");
                break;
            default:
                System.out.println("Enter a valid no. between 1 to 3");
                break;
        }
    }
}
