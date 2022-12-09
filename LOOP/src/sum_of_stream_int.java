import java.util.Scanner;

public class sum_of_stream_int {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
//        do{
//            sum += num;
//            num =scan.nextInt();
//        }while (num != -1);
        while (num != -1) {
            sum += num;
            num = scan.nextInt();
        }
            System.out.println(sum);
        }
    }
