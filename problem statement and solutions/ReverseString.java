import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Reverse a string");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String input = scanner.nextLine();
                    String reversed = reverseString(input);
                    System.out.println("Reversed String: " + reversed);
                    break;
                case 0:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println(); // Print a blank line for readability
        }

        scanner.close();
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();
        return reversed.toString();
    }
}

