//      *
//     * *
//    *   *
//   *     *
//  *       *
//   *     *
//    *   *
//     * *
//      *

import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();
        int i = 1;
        while(i<=rows){
            int j = 1;
            while(j<=rows-i){
                System.out.print(" ");
                j++;
            }
            j = 1;
            while(j<=2*i-1){
                if(j==1 || j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
        i = rows-1;
        while(i>=1){
            int j = 1;
            while(j<=rows-i){
                System.out.print(" ");
                j++;
            }
            j = 1;
            while(j<=2*i-1){
                if(j==1 || j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
