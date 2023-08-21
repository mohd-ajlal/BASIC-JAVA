package lecture3;

public class method3 {
    public static void main(String[] args) {
        add();
        method3 m = new method3();
        m.sub();
    }

    public static void add(){
        System.out.println("Static");
    }

    public void sub(){
        System.out.println("Non static");
    }
}
