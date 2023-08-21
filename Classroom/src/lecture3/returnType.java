package lecture3;

public class returnType {
    public static void main(String[] args) {
        int a = 10, b =20;

        int out = add(a, b);
        System.out.println(out);
    }

    public static int add(int a, int b){
        return a+b;
    }
}
