public class Main {

    public static void main(String[] args)
    {
        int x = 15;
        int y = 5;
        System.out.println("Before swapping:" + " x = " + x + ", y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping:" + " x = " + x + ", y = " + y);
    }
}
