import  java.util.Scanner;
public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary_num = sc.nextInt();


        int ans = 0; //converted decimal number
        int out = 1; // 2 ^ 0 = 1 power of 2

        while(binary_num>0){
            int unit_digit = binary_num %10;
            ans += (unit_digit * out);
            binary_num /= 10;
            out *= 2;
        }
        System.out.println(ans);
    }
}
