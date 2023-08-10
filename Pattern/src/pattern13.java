import java.util.Scanner;

public class pattern13 {
    static void pattern(int n){
        int nst = 1;
        int row = 1;
        while(row<= ((2*n)-1)){
            for(int i = 1; i<=nst; i++){
                System.out.print("* ");
            }
            if(row<n){
                nst++;
            }
            else{
                nst--;
            }
            System.out.println();
            row++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        pattern(n);
    }
}
