import java.util.Scanner;
public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();
        for(int i = 1; i<=rows; i++){
            for(int j = 0; j<=rows; j++){
                if(i%2==0){if(j%2==0){
                    System.out.print("2");
                }
                else{
                    System.out.print("1");
                }}
                else{
                    if(j%2==0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("2");
                    }
                }
            }
            System.out.println();
        }
    }
}
