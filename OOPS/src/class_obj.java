class oops{
        String name;
        int age;
    
}

public class class_obj{
    public static void main(String[] args) {
        oops obj1 = new oops();
        oops obj2 = new oops();
        obj1.name = "John";
        obj1.age = 20;
        obj2.name = "Mary";
        obj2.age = 18;
        System.out.println(obj1.name+" "+obj1.age);
        System.out.println(obj2.name+" "+obj2.age);
    }
    
}
