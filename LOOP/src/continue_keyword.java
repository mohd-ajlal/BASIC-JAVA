public class continue_keyword {
    public static void main(String[] args) {
        System.out.println("Print all the values between 1 to 50 except the multiple of 3");
        myloop : for(int num = 1; num<= 50; num++){
            if(num%3 == 0){
                continue myloop;
            }
            System.out.print(num+" ");
        }
        System.out.println("\n");
        int num = 1;
        while (num<=50){
            if(num%3 == 0){
                num++;
                continue;
            }
            System.out.print(num+ " ");
            num++;

        }
    }
}
