package JP_MORGAN;

import java.util.Scanner;

public class Soldier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int a= sc.nextInt();
            int b = sc.nextInt();
            int n=1;
            int ans=0;
            for(int j=b+1;j<=a;j++){
                n = n *j;
            }
            for(int j=2;j*j<=n;j++){
                if(n%j==0){
                    while(n%j==0){
                        ans++;
                        n/=j;
                    }
                }
            }
            if(n!=1){
                ans++;
            }
            System.out.println(ans);
        }

    }
}
