import java.util.Scanner;
public class prime {
    public static void prime(int num){
        int s = 0;
        for(int i = 1; i<=num;i++){
            if(num%i==0){
                s = s+1;
            }
        }
        if(s == 2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. to check whether it is prime or not: ");
        int num = sc.nextInt();
        prime(num);
    }
}
