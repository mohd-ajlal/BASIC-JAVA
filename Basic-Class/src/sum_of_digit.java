import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int out = 0;
        while(num>0){
            int temp = num % 10;
            num = num/10;
            out += temp;
        }
        System.out.println(out);
    }
}
