import java.util.Arrays;
        import java.util.Scanner;

public class StringReadCombineDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[10];

        System.out.println("Enter 10 strings:");

        for (int i = 0; i < 10; i++) {
            strings[i] = scanner.nextLine();
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\nString Operations Menu:");
            System.out.println("1. Sort strings");
            System.out.println("2. Combine two strings");
            System.out.println("3. Reverse the first string");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    sortStrings(strings);
                    break;
                case 2:
                    combineStrings(strings);
                    break;
                case 3:
                    reverseFirstString(strings);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option (1-4).");
                    break;
            }
        }

        scanner.close();
    }

    public static void sortStrings(String[] strings) {
        String[] sortedStrings = Arrays.copyOf(strings, strings.length);
        Arrays.sort(sortedStrings);

        System.out.println("\nSorted strings:");
        for (String str : sortedStrings) {
            System.out.println(str);
        }
    }

    public static void combineStrings(String[] strings) {
        if (strings.length < 2) {
            System.out.println("\nInsufficient strings to combine!");
            return;
        }

        String combinedString = strings[0] + strings[1];
        System.out.println("\nCombined string: " + combinedString);
    }

    public static void reverseFirstString(String[] strings) {
        if (strings.length < 1) {
            System.out.println("\nNo strings available to reverse!");
            return;
        }

        String reversedString = reverseString(strings[0]);
        System.out.println("\nReversed first string: " + reversedString);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
