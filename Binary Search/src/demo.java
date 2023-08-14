import  java.util.Scanner;

public class demo {
    static boolean demo_out(int[] arr, int target) {
        int start = 0;
        int end  = arr.length;
        int len = (start+end)/2;
//        int flag = 0;
        while (start != end) {
            if (target == arr[len]) {
                return true;
            } else if (target > arr[len]) {
                start = len + 1;
                len = (start+end)/2;
            } else if (target < arr[len]) {
                end = len ;
                len = (start+end)/2;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.print("Enter element to be search: ");
        int target = sc.nextInt();
        boolean out = demo_out(array, target);
        if(out){
            System.out.println("Find.");
        }else{
            System.out.println("Not find.");
        }
    }
}