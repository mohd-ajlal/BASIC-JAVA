//Methods - two types
//1. Static - can call by name
//2. Non-static


package lecture3;

public class methods {
    public static void main(String[] args) {
        System.out.print("Hello ");
        add();
        System.out.print("What are you doing ");
        add();
    }

    public static void add(){
        System.out.println("abc");
    }

    public static class method3 {
        public static void main(String[] args) {
            add();
            method3 m = new method3();
            m.sub();
        }

        public static void add(){
            System.out.println("Static");
        }


        public void sub(){
            System.out.println("Non Static ");
        }
    }
}
