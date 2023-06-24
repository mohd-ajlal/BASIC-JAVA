import java.util.Scanner;
public class method_sum {
    static int area(int x, int y){
        return x*y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter value of y: ");
        int y = sc.nextInt();
        // method_sum obj = new method_sum();
        // int result = obj.area(x,y);
        System.out.println("Area is: "+area(x,y));
    }
}
