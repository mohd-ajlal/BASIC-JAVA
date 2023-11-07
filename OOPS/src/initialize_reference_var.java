public class initialize_reference_var {
    static class demoClass{
        String name;
        int num;
        public static void main(String[] args) {
            demoClass dc = new demoClass();
            dc.name = "Mohd Ajlal";
            dc.num = 10;
            System.out.println(dc.name);
            System.out.println(dc.num);
        }
    }
}
