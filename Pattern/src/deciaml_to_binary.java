import java.util.Scanner;
public class deciaml_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        int binary = 0;
        int i = 1;
        while(decimal>0){
            int rem = decimal%2;
            binary += rem*i;    
            decimal = decimal/2;
            i = i*10;
        }
        System.out.println("Binary no.: "+binary);
    }
}
