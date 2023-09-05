import java.util.Scanner;

public class new_yera_and_hurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int out = (240 - k)/5;
        int l=0,r=n;
        while(l<r){
            int m=l+(r-l+1)/2;
            if((m*(m+1))/2<=out)l=m;
            else r=m-1;
        }
        System.out.print(l);
        sc.close();
    }
}
