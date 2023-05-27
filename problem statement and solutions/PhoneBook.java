import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of entries in the phone book: ");
        int numEntries = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character

        // Create a HashMap to store phone book entries
        Map<String, String> phoneBook = new HashMap<>();

        // Read phone book entries
        for (int i = 0; i < numEntries; i++) {
            System.out.print("Enter the name: ");
            String name = scanner.nextLine();
            System.out.print("Enter the phone number: ");
            String phoneNumber = scanner.nextLine();
            phoneBook.put(name, phoneNumber);
        }

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Search for a contact");
            System.out.println("2. Add a new contact");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the name to search: ");
                    String searchName = scanner.nextLine();
                    if (phoneBook.containsKey(searchName)) {
                        String phoneNumber = phoneBook.get(searchName);
                        System.out.println();
                        System.out.println("Name: " + searchName + " | " + "Contact: " + phoneNumber);
                    } else {
                        System.out.println();
                        System.out.println("Contact not found!");
                    }
                    break;
                case 2:
                    System.out.print("Enter the name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter the phone number: ");
                    String newPhoneNumber = scanner.nextLine();
                    phoneBook.put(newName, newPhoneNumber);
                    System.out.println("Contact added successfully!");
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        }
    }
}
