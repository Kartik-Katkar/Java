import java.util.*;

public class StringContains_e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = scanner.nextLine();

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == character) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The character '" + character + "' is repeated " + count + " time(s) in the string.");
        } else {
            System.out.println("The character '" + character + "' is not repeated in the string.");
        }
    }
}
