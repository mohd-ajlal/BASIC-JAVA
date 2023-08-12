import java.util.Scanner;

public class pattern16 {
    static void pattern(){
        int n = 7;
        int nsp1 = 4;
        int nsp2 = 3;
        int nsp = -1;



        int row = 1;
        while(row<=n){
//            star
            for(int i = 1; i<=nsp1; i++){
                System.out.print("* ");
            }
//            space
            for(int i = 1; i<=nsp; i++){
                System.out.print("  ");
            }
//            star
            for(int i = 1; i<=nsp2; i++){
                System.out.print("* ");
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
        pattern();
    }
}
