import java.util.Scanner;
public class for1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n = sc.nextInt();
//        int counter;
        for(int counter = 0;counter<n; counter = counter+1){
            System.out.println(counter);
        }
    }
}
