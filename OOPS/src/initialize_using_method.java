public class initialize_using_method {
    static class ini{
        String name;
        int num;

        void intObj(String n, int no){
            name = n;
            num = no;
        }

        void display(){
            System.out.println(name);
            System.out.println(num);
        }
        public static void main(String[] args) {
            ini inM = new ini();
            inM.intObj("Mohd Ajlal", 10);
            inM.display();
        }
    }
}
