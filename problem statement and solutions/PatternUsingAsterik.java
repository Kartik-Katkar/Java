import java.util.Scanner;

public class PatternUsingAsterik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Diamond Pattern");
            System.out.println("2. Pyramid Pattern");
            System.out.println("3. Inverted Triangle Pattern");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of rows (half of the diamond): ");
                    int rows = scanner.nextInt();
                    drawDiamondPattern(rows);
                    break;
                case 2:
                    System.out.print("Enter the number of rows: ");
                    int pyramidRows = scanner.nextInt();
                    drawPyramidPattern(pyramidRows);
                    break;
                case 3:
                    System.out.print("Enter the number of rows: ");
                    int invertedTriangleRows = scanner.nextInt();
                    drawInvertedTrianglePattern(invertedTriangleRows);
                    break;
                case 4:
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

    public static void drawDiamondPattern(int rows) {
        // Upper half of the diamond
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void drawPyramidPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void drawInvertedTrianglePattern(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
