import java.util.Scanner;

public class passwordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int capital = 0;
        int small = 0;
        int num = 0;
        int special = 0;
        for(int i = 0; i<len; i++){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                capital++;
            } else if (s.charAt(i) >=97 && s.charAt(i) <=122) {
                small++;
            } else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                num++;
            } else if (s.charAt(i) == '!' || s.charAt(i) == '?' || s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == '_'){
                special++;
            } else {
                capital = -1;
                small = -1;
                num = -1;
                special = -1;
                break;
            }
        }
        if(len>= 5){
            if(capital>0 && small >0 && num >0 && special >=0){
                System.out.println("Correct");
            }else {
                System.out.println("Too weak");
            }
        }else {
            System.out.println("Too weak");
        }
    }
}
