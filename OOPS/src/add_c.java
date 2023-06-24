import java.util.Scanner;

class Algebra{
    int add(int x, int y){
        return x+y;
    }
}

public class add_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter value of y: ");
        int y = sc.nextInt();
        Algebra alg = new Algebra();
        System.out.println("Sum is: "+alg.add(x, y));

    }
}
