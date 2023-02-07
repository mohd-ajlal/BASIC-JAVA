// s = 1-2+3-4.....n

import java.util.Scanner;

public class sum_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int s = 0;
        for(int i =1; i<=n; i++){
            if(i%2 == 0){
                s = s - i;

            }
            else{
                s = s+i;
            }
        }
        System.out.println("The value of s is: "+s);
    }
}
