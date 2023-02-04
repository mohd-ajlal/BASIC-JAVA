import java.util.Scanner;
public class while3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=num){
            if(num%i == 0){
                sum++;
            }
            i++;
        }
        if (sum == 2){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not prime");
        }
    }
}
