import java.util.Scanner;

public class age_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age = sc.nextInt();
        if (age<=12){
            System.out.println("You are child.");

        }
        else if(age>12 && age <=21){
            System.out.println("You are teenager");
        }
        else if(age>21 && age <= 60){
            System.out.println("You are adult");
        }
        else{
            System.out.println("You are old");
        }
    }
}
