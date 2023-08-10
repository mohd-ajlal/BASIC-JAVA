import java.util.Scanner;

public class linear_search {
    static int li_search(int num, int[] arr){
//        int ret = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == num){
//                ret = i;
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter no. to be search: ");
        int num = sc.nextInt();
        int out = li_search(num, arr);
        if(out == -1){
            System.out.print("Not Found");
        }
        else{
            System.out.print("The number "+num+" is present at "+out+" index.");
        }
    }
}
