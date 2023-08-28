    import java.util.Scanner;
    public class deciaml_to_binary {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a decimal number: ");
            long decimal = sc.nextLong();
            long binary = 0;
            long i = 1;
            while(decimal>0){
                long rem = decimal%2;
9                binary += rem*i;
                decimal = decimal/2;
                i = i*10;
            }
            System.out.println("Binary no.: "+binary);
        }
    }
