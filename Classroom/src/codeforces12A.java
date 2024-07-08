import java.util.Scanner;

public class codeforces12A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] s = new char[3][4];
        for (int i = 0; i < 3; i++) {
            s[i] = scanner.next().toCharArray();
        }
        System.out.println((s[0][0] == s[2][2] && s[0][1] == s[2][1]
                && s[0][2] == s[2][0] && s[1][0] == s[1][2]) ? "YES" : "NO");
    }

//    static boolean arr(char[][]){
//
//
//    }
}

