import java.util.Scanner;

public class pattern16 {
    static void pattern(int n){
        int nsp1 = n/2 + 1;
        int nsp2 = n/2;
        int nsp = -1;
        int row = 1;
        while(row<=n){
//            star
            for(int i = 1; i<=nsp1; i++){
                System.out.print("*\t");
            }
//            space
            for(int i = 1; i<=nsp; i++){
                System.out.print("\t");
            }
//            star
            for(int i = 1; i<=nsp2; i++){
                System.out.print("*\t");
            }

            if(row<=n/2){
                nsp1--;
                if(row!=1) {
                    nsp2--;
                }
                nsp += 2;
            }
            else{
                nsp1++;
                if(row!=n-1) {
                    nsp2++;
                }
                nsp -=2;
            }


            row++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
