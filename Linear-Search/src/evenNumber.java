//Given an array nums of integer, return how many of them contains an even number of digit

public class evenNumber {
/*
    static int even_digit(int[] nums){
        int count = 0;
        for(int element : nums){
            if(element<0){
                element = -1 * element;
            }
            int c1 = 0;
            while(element>0){
                element = element/10;
                c1++;
            }
            if(c1%2==0){
                count++;
            }
        }
        return count;
    }
*/

    static int findNumbers(int[] nums){
        int count = 0;
        for(int element: nums){
            if(even(element)){
                count++;
            }
        }
        return count;
    }

//    static int digit(int element){
//        int c1 = 0;
//        while(element>0){
//            element = element/10;
//            c1++;
//        }
//        return c1;
//    }

//    static int findNumber(int[] nums) {
//        int count = 0;
//        for (int element : nums) {
//            if (element < 0) {
//                element = -1 * element;
//            }
//            int c1 = (int) (Math.log10(element)) + 1;
//            if (c1 % 2 == 0) {
//                count++;
//            }
//        }
//        return count;
//
//    }

    static int digit(int element){
        return (int)(Math.log10(element))+1;
    }
    static boolean even(int c1){
        int numberOfDigit = digit(c1);
        return numberOfDigit % 2 == 0;
    }

    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int out = findNumbers(arr);
        System.out.println(out);
    }
}
