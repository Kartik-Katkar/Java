import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static int findLongestConsecutiveSequence(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLength = 0;

        // Add all numbers to the set
        for (int num : nums) {
            set.add(num);
        }

        // Iterate through the array and check for consecutive sequences
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = null;

        int choice = 0;
        while (choice != 3) {
            System.out.println("Menu:");
            System.out.println("1. Enter array elements");
            System.out.println("2. Find Longest Consecutive Sequence");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    nums = enterArrayElements(scanner);
                    break;
                case 2:
                    if (nums == null) {
                        System.out.println("Array elements are not entered yet. Please enter array elements first.");
                    } else {
                        int longestSequenceLength = findLongestConsecutiveSequence(nums);
                        System.out.println("Length of the longest consecutive elements sequence: " + longestSequenceLength);
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }

    public static int[] enterArrayElements(Scanner scanner) {
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        scanner.nextLine(); // Consume the newline character
        return nums;
    }
}
