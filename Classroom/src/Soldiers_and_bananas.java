import java.util.Scanner;

public class Soldiers_and_bananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();   
        int n = sc.nextInt();
        int out = k * (n*(n+1)/2);
        int ans = out>r?out - r:0;
        System.out.println(ans);                                          
    }
}
