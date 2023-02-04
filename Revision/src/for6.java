import java.util.Scanner;
public class for6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=num; i++){
            if(num%i==0){
                sum++;
            }
        }
        if(sum == 2){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not prime");
        }
    }
}
