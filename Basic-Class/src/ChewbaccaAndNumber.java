import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        long tens = 1;
        long out = 0;
        while(num!=0){
            long rem = num%10;

            if(rem>=5 && num!=9){
                long k = 9 - rem;
                out += k*tens;
            }else{
                out += rem*tens;
            }       
            num /= 10;
            tens *= 10;


            // int temp = 9 - rem;
            // if(rem<temp){
            //     out += rem*tens;
            //     tens *= 10;
            // }else{
            //     out += temp*tens;
            //     tens *= 10;
            // }
            // num /= 10;
        }
        System.out.println(out);
    }
}
