import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = scanner.nextLine();

        Map<String, Integer> wordCountMap = new HashMap<>();

        // Split the input string into words using whitespace as the delimiter
        String[] words = input.split("\\s+");

        // Count the occurrences of each word
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                // If the word is already present in the map, increment its count
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                // If the word is encountered for the first time, add it to the map with count = 1
                wordCountMap.put(word, 1);
            }
        }

        // Print the word count map
        System.out.println(wordCountMap);
    }
}
