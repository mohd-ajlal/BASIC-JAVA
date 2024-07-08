import java.util.Scanner;

public class codeforces48A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int total = (n  * (n+1))/2;
        m = m%total;
        if(m==0){
            System.out.print(0);
        }else{
            int i = 1;
            while (m>i){
                m -= i;
                i++;
            }
            System.out.println(m);
        }
    }
}
