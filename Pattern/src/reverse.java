import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int out = 0;
    while(num>0){
        int temp = num%10;
        out = out * 10;
        out += temp;
        num = num/10;
    }
    System.out.println(out);
    }
}
