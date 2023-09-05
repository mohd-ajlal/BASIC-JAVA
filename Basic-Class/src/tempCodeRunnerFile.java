import java.util.Scanner;

public class new_yera_and_hurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int out = 240 - k;
        int i = 1;
        int ans = 0;
        while(out>=0 && i<=n){
            int temp = 5*i;
            out -= temp;
            if(out>=0){
                ans++;
            }
            i++;
        }
        System.out.print(ans);
        sc.close();
    }
}
