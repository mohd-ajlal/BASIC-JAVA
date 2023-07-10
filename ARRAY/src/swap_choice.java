import java.util.Scanner;

public class swap_choice {

    static void print_original(int a, int b){
        System.out.println("Original value of a: "+a);
        System.out.println("Original value of b: "+b);
    }

    static int[] swap(int a, int b, int choice){
        if(choice == 1){
            int temp = a;
            a = b;
            b = temp;
        }
        else if(choice == 2){
            a = a + b;
            b = a - b;
            a = a - b;
        }
        else if(choice == 3){
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
        }
        else{
            System.out.println("Invalid choice!");
            System.exit(0);
        }
        int arr[] = {a, b};
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.println();
        print_original(a, b);
        System.out.println();
        System.out.println("Enter your choice: ");
        System.out.println("1. Using third variable");
        System.out.println("2. Using addition and subtraction");
        System.out.println("3. Using XOR operator");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        int arr[] = swap(a, b, choice);
        System.out.println();
        System.out.println("Swapped value of a: "+arr[0]);
        System.out.println("Swapped value of b: "+arr[1]);
    }
}
