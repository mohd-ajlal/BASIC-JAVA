public class KadensAlgo {
    private static int kadens(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            max = Math.max(sum, max);
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,-4, 5, 6};
        System.out.println(kadens(arr));
    }
}
