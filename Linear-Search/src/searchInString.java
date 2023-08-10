import java.util.*;

public class searchInString {

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Ajlal";
        System.out.print("Enter the character to be search: ");
        char target = sc.next().charAt(0);  // it will automatically take first character of the input string.
        System.out.print(search(name, target));
    }
}
