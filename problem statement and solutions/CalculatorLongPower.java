import java.util.Scanner;

class MyCalculator {
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}

public class CalculatorLongPower {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Calculate power");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the value of n: ");
                    int n = scanner.nextInt();
                    System.out.print("Enter the value of p: ");
                    int p = scanner.nextInt();

                    try {
                        long result = calculator.power(n, p);
                        System.out.println(n + " raised to the power of " + p + " is: " + result);
                    } catch (Exception e) {
                        System.out.println("Exception occurred: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
            scanner.nextLine(); // Consume the newline character
        }
    }
}
