import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class RemoveRepeatedElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int[] result = removeDuplicates(array);

        System.out.println("Original Array:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        System.out.println("\nArray with duplicates removed:");
        for (int element : result) {
            System.out.print(element + " ");
        }
    }

    public static int[] removeDuplicates(int[] array) {
        List<Integer> uniqueElements = new ArrayList<>();
        for (int element : array) {
            if (!uniqueElements.contains(element)) {
                uniqueElements.add(element);
            }
        }

        int[] result = new int[uniqueElements.size()];
        for (int i = 0; i < uniqueElements.size(); i++) {
            result[i] = uniqueElements.get(i);
        }

        return result;
    }
}
