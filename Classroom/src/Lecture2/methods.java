package Lecture2;

//import java.util.Map;

public class methods {
    public static void main(String[] args) {
        int a = 23;
        int b = 12;
        methods m = new methods();
        m.out();
        add(a, b);
    }
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void out(){
        System.out.print("Sum is: ");
    }
}


/*
abc.length() //this is method.
arr.length //this is property.
*/