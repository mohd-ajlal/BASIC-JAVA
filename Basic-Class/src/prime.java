import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int out = 0;
        for(int i = 2; i < num; i++) {
            if(num%i==0){
                out = 1;
                break;
            }
        }
        if(num == 0 || num == 1){
            System.out.println("neither prime nor composite");
        }else if(out == 1){
            System.out.println("Composite no.");
        }else{
            System.out.println("Prime");
        }
    }
}
