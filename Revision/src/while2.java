import java.util.Scanner;
public class while2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int num = sc.nextInt();
        int i = 0;
        while(i<=num){
            if(i%2==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
