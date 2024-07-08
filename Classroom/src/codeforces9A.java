import java.util.Scanner;

public class codeforces9A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int w = sc.nextInt();
        int p;
        if(y>w)
        {
            p=7-y;
        }
        else
        {
            p=7-w;
        }

        switch(p)
        {
            case 0:
                System.out.println("0/1");
                break;

            case 1:
                System.out.println("1/6");
                break;

            case 2:
                System.out.println("1/3");
                break;

            case 3:
                System.out.println("1/2");
                break;

            case 4:
                System.out.println("2/3");
                break;

            case 5:
                System.out.println("5/6");
                break;

            case 6:
                System.out.println("1/1");
                break;

        }
    }
}
