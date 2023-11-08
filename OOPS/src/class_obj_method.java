public class class_obj_method {
    static class Animal{
        public void walk(){
            System.out.println("I am Walking");
        }
        public static void main(String[] args) {
            Animal ami = new Animal();
            Bird bi = new Bird();
            ami.walk();
            bi.fly();
        }
    }
}

class Bird{
    public void fly(){
        System.out.println("I am flying");
    }
}
