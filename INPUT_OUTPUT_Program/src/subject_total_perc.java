import java.util.Scanner;

public class subject_total_perc {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter marks of subject 1: ");
        int sub1 = name.nextInt();
        System.out.println("Enter marks of subject 2: ");
        int sub2 = name.nextInt();
        System.out.println("Enter marks of subject 3: ");
        int sub3 = name.nextInt();
        System.out.println("Enter marks of subject 4: ");
        int sub4 = name.nextInt();
        System.out.println("Enter marks of subject 5: ");
        int sub5 = name.nextInt();
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Total marks: " + total);
        float perc = (total * 100) / 500;
        System.out.println("Percentage: " + perc);
    }
    }

