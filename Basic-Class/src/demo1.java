import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        scanner.close();
        
        long result = transformNumber(x);
        System.out.println(result);
    }
    public static long transformNumber(long x) {
        String xStr = Long.toString(x);
        char[] digits = xStr.toCharArray();
        
        for (int i = 0; i < digits.length; i++) {
            int digit = Character.getNumericValue(digits[i]);
            if (i == 0) {
                if (digit > 4 && digit != 9) {
                    digits[i] = (char) (9 - digit + '0');
                }
            } else {
                if (digit > 4) {
                    digits[i] = (char) (9 - digit + '0');
                }
            }
        }
        
        String resultStr = new String(digits);
        long result = Long.parseLong(resultStr);
        
        return result;
    }
}
