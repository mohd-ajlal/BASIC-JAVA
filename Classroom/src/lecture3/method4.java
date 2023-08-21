package lecture3;

public class method4 {
    int a =10;
//    or for static method
//    static int a = 10;

    public static void main(String[] args) {
        method4 m = new method4();
        System.out.println("hello");
        int a = 10000;
        add();
        m.sub();
    }
    public static void add(){
        int a = 100; // it the function is static and there is no int a then it will throw error.
//        because non-static variable a cannot be referenced from a static context.
//        method4 m = new method4();
        System.out.println(a);
    }
    public void sub(){
        System.out.println(a);
    }
}
