import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num>0){
            System.out.print(num&1);
            num = num>>1;
        }
    }
}
