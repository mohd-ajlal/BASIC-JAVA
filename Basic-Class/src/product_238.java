import java.util.Arrays;

public class product_238 {
    static int[] productExceptSelf(int[] nums) {
        // int[] out = new int[nums.length];
        // for (int i = 0; i < out.length; i++){
        //     int temp = 1;
        //     for(int j = 0; j < out.length; j++){
        //         if(i != j){
        //             temp *= nums[j];
        //         }
        //     }
        //     out[i] = temp;
        // }
        int left[] = new int[nums.length];
        left[0] =1;
        for(int i = 1; i < left.length; i++){
            left[i] = left[i-1] * nums[i-1];
        }
        int[] right= new int[nums.length];
        right[right.length - 1] = 1;
        for(int i = nums.length - 2; i>=0; i--){
            right[i] = right[i+1] * nums[i+1];
        }
        for(int i =0; i<right.length; i++){
            right[i] = right[i] * left[i];
        }
        return right;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] out = productExceptSelf(nums);
        System.out.println(Arrays.toString(out));
    }
}
