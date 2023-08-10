public class leetcode_find_even_digit {
    static int findNumbers(int[] nums) {
        int count, count1 =0;
        for(int element : nums){
            count = (int)(Math.log10(element)) +1;
            if(count %2 == 0){
                count1++;
            }
        }
        return count1;
    }
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int out = findNumbers(nums);
        System.out.println(out);
    }
}
