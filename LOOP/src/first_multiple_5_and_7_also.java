public class first_multiple_5_and_7_also {
    public static void main(String[] args) {
        int num = 1;
        while (true){
            // System.out.println(num);
            if((num%5 == 0 )&&(num % 7 == 0)){
                System.out.println("Found ans: " +num);
                break;
            }
            num++;
        }
    }
}
