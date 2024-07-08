import java.util.Arrays;

public class anagramStr {
    static String sort(String str, int len){
        String[] arr = str.split("");
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();

    }

    static boolean isAnagram(String s1, String s2){
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "abbc";
        String s2 = "cbab";
        int lens1 = s1.length();
        int lens2 = s2.length();
        if(lens2 == lens1){
            String s1new = sort(s1, lens1);
            String s2new = sort(s2, lens2);
            System.out.println(isAnagram(s1, s2));
        }else {
            System.out.println(false);
        }
    }
}
