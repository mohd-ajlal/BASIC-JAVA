import java.util.Scanner;

public class Profit_loss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Cost Price(C.P.): ");
        int cp = scan.nextInt();
        System.out.print("Enter Selling price(S.P.): ");
        int sp = scan.nextInt();
        if (cp>sp){
            int loss = cp - sp;
            System.out.println("Loss: "+loss);
        } else if (sp>cp) {
            int profit = sp - cp;
            System.out.println("Profit is: "+profit);
        }
        else{
            System.out.println("Neither profit nor loss");
        }
    }
}
