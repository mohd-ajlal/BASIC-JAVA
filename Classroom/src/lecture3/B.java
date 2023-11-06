package lecture3;

public class B extends A{
    public static void main(String[] args) {
        int a = 12;
        int b = 10;

        B obj = new B();
        int k = obj.add(a, b);
        System.out.println(k);

        int  l = sub(a, b);
        System.out.println(l);
    }
}
