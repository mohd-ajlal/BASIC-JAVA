import java.util.Scanner;
public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary no.: ");
        int binary = sc.nextInt();
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            }
            else{
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        System.out.println("Decimal no.: "+decimal);
    }
}
