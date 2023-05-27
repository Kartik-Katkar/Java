import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        int[] commonElements = findCommonElements(array1, array2);

        System.out.println("Common Elements:");
        for (int element : commonElements) {
            System.out.print(element + " ");
        }
    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        List<Integer> commonElementsList = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j] && !commonElementsList.contains(array1[i])) {
                    commonElementsList.add(array1[i]);
                    break;
                }
            }
        }

        int[] commonElements = new int[commonElementsList.size()];
        for (int i = 0; i < commonElementsList.size(); i++) {
            commonElements[i] = commonElementsList.get(i);
        }

        return commonElements;
    }
}
