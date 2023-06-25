import java.util.Scanner;

public class odd_even {
    static int e_o(int x){
        if(x%2==0) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int x = sc.nextInt();
        if(e_o(x)==1) System.out.println("Even");
        else System.out.println("Odd");
    }
}
