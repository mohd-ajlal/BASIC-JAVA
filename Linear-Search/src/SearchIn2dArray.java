import java.util.*;
public class SearchIn2dArray {
    static int[] search(int[][] arr, int target){
        for (int row = 0; row<arr.length; row++) {
            for (int col = 0; col<arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {24,5,1},
                {2,35,6,2},
                {69, 3,54,24,12}
        };
        System.out.print("Enter element to hbe search: ");
        int target  = sc.nextInt();
//        System.out.println(search(arr, target));
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

    }
}
