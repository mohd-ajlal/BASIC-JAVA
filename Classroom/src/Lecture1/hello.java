package Lecture1;

public class hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("abc");
        System.out.print("variable declare \n");
        int a = 10;
        System.out.println("By using for loop");
        for(int i = 0; i<a; i++){
            System.out.println(i);
        }

        System.out.println("By using while loop");
        int i = 0;
        while(i<a){
            System.out.println(i);
            i++;
        }
    }
}
