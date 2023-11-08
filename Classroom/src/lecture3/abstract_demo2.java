package lecture3;

public class abstract_demo2 extends abstract_demo{
    public static void main(String[] args) {
        abstract_demo ab = new abstract_demo2();
        ab.Add();
        ab.Sub();
    }
    @Override
    public void Add() {
        System.out.println("Add");
    }
}
