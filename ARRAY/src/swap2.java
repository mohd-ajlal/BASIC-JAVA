import java.util.Scanner;

public class swap2 {
    static void print_original(int a, int b){
        System.out.println("Original value of a: "+a);
        System.out.println("Original value of b: "+b);
    }

    static int[] swap(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        int arr[] = {a, b};
        return arr;
    }

    static void print_swapped(int a, int b){
        System.out.println("Swapped value of a: "+a);
        System.out.println("Swapped value of b: "+b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value of b: ");
        int b = scanner.nextInt();
        System.out.println();
        print_original(a, b);
        int arr[] = swap(a, b);
        System.out.println();
        print_swapped(arr[0], arr[1]);
    }
}
