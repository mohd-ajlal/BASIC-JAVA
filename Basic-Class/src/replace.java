import java.util.Scanner;

public class replace {
    static int len(int num){
        int len = 0;
        while(num!=0){
            num /= 10;
            len++;
        }
        return len;
    }
    static int reverse(int num){
        int out = 0;
        while(num>0){
            int temp = num%10;
            out = out * 10;
            out += temp;
            num = num/10;
        }
        return out;
    }
    static int replac(int num){
        int leng = len(num);
        int ans = 0;
        for(int i = 0; i<leng; i++){
            int temp = num % 10;
            if(temp == 0){
                temp = 5;
                ans = ans * 10;
                ans += temp;
            }else{
                ans = ans * 10;
                ans += temp;
            }
            num /= 10;
        }
        return reverse(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int out = replac(num);
        System.out.println(out);
    }
}
