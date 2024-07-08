import java.util.Scanner;

public class codeforces38A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rank = sc.nextInt();
        int[] arr= new int[rank-1];
        for(int i = 0; i < rank-1; i++){
            arr[i] = sc.nextInt();
        }
        int f_rank = sc.nextInt();
        int end_rank = sc.nextInt();
        int year = 0;
        for(int i = f_rank; i<end_rank; i++){
            year+= arr[i-1];
        }

        System.out.println(year);
    }
}
