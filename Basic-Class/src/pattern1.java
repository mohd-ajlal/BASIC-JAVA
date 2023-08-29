import java.util.Scanner;

public class pattern1 {
    static void pattern(int rows){
        for(int i = 0; i<rows; i++){
            int k = rows - i - 1;
            for(int j  = 0 ; j< rows-i-1; j++){
                System.out.print("  ");
            }
            for(int j = 0; j<2*i+1; j++){
                k = j<=i ? k+1: k-1;
                if(j==i){
                    System.out.print("0 ");
                }else{
                    System.out.print(k+ " ");
                }
            }
                System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row  = sc.nextInt();
        pattern(row);
    }
}
