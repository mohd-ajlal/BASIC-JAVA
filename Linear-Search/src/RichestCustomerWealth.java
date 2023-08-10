//import java.util.Arrays;

public class RichestCustomerWealth {
    static int highest(int[][] accounts){
        int highest = Integer.MIN_VALUE;
        for (int[] account : accounts) {
//            int temp = Arrays.stream(account).sum();
            int temp = 0;
            for (int i : account) {
                temp += i;
            }
            if (temp > highest) highest = temp;
        }
        return highest;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3}, {3,5}};
        int out = highest(accounts);
        System.out.println(out);

    }
}
