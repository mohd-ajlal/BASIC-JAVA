import java.util.Scanner;

public class odd_even_rule {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Number of car numbers
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < N; i++) {
            long carNumber = scanner.nextLong();
            scanner.nextLine(); // Consume the newline

            if (isCarAllowed(carNumber)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        scanner.close();
    }

    public static boolean isCarAllowed(long carNumber) {
        int sumEven = 0;
        int sumOdd = 0;
        boolean isEvenDigit = true;

        while (carNumber > 0) {
            int digit = (int) (carNumber % 10);

            if (isEvenDigit) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }

            isEvenDigit = !isEvenDigit;
            carNumber /= 10;
        }

        return (sumEven % 4 == 0) || (sumOdd % 3 == 0);
    }
}
