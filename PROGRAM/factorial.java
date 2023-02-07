import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        int s = 1;
        if(n==0){
            s += 0;
        }
        else if(n>0){
            for(int i = 1; i<=n; i++){
                s = s *i;
            }

        } else{
            n = n * -1;
            for(int i = 1; i<=n; i++) {
                s = s * i;

            }
            s = s * -1;
        }

        System.out.println("The factorial of "+n+" is "+s);
    }
}
