import java.util.*;

public class SearchInStringForEach {
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(char ch: str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String name = sc.nextLine();
        System.out.print("Enter the character to be search: ");
        char target = sc.next().charAt(0);  // it will automatically take first character of the input string.
        System.out.print(search(name, target));
    }
}
