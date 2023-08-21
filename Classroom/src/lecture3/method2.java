package lecture3;

public class method2 {
    public static void main(String[] args) {
        int k = add();
        System.out.println(add());
        System.out.println("Value of k is: "+k);
    }
    public static int add(){
        System.out.println("abc");
        return 1;
    }
}

//  output:

//  abc
//  abc
//  1
//  Value of k is: 1
