// Ceiling = smallest element in array equal to or greater than the target element.

import java.util.Scanner;

public class ceilingOfANumber {
    static int ceil(int[] array, int target){
        int start = 0;
        int end = array.length - 1;
        if(array[start]<array[end]){
            while(start <= end){
                int mid = start + (end-start)/2;
                if(target == array[mid]){
                    return array[mid];
                } else if(target<=array[start]){
                return array[start];
                }
                else if(target>array[end]){
                    return array[end+1];
                }

                else if (target<array[mid]) {
                    end = mid -1;
                } else if (target>array[mid]) {
                    start = mid + 1;
                }
            }
        }else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if(target == array[mid]){
                    return mid;
                }
                else if (target <= array[end]) {
                    return array[end];
                }
                else if(target>array[start]){
                    return array[start-1];
                }
                else if (target < array[mid]) {
                    start = mid-1;
                } else if (target > array[mid]) {
                    end = mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {2,4,5,7,9,12,16,18,20};
//        int[] array = {5,4,2,0,-1,-2,-12,-32};
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int out = ceil(array, target);
        System.out.print("Ceil of "+target+" is "+out);
    }
}
