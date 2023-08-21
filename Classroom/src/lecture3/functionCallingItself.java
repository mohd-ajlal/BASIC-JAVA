package lecture3;

public class functionCallingItself {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        add(a,b);
    }

    public static void add(int a, int b){
        System.out.println(a+b);
        add(a, b);  // function will call itself infinite time so at a moment it will return error by stack overflow.
    }
}
