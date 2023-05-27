import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Generate multiplication table");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Input a number: ");
                    int number = scanner.nextInt();

                    System.out.println("Multiplication table for " + number + ":");
                    for (int i = 1; i <= 10; i++) {
                        int result = number * i;
                        System.out.println(number + " x " + i + " = " + result);
                    }
                    break;
                case 2:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        }

        System.out.println("Exiting...");
        scanner.close();
    }
}

