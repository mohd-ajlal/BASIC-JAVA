//* * * * *
//    * * * *
//        * * *
//            * *
//               *

import java.util.Scanner;

public class pattern11 {
    static void pattern(int rows){
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<i; j++){
                System.out.print("    ");
            }
            for(int j = 0; j<rows-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();
        pattern(rows);
    }
}
