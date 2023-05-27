import java.util.Scanner;

class Arithmetic_class {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic_class {
}

public class Arithmetic {
    public static void main(String[] args) {
        Adder adder = new Adder();

        // Print superclass name
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());

        // Take user input for two integers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        scanner.close();

        // Perform addition
        int sum = adder.add(num1, num2);

        // Print results
        System.out.println("Number 1= " + num1 + "   |   " + "Number 2= " + num2 + " " + "\nSum = "+ num1 + " + " + num2 + " = " + sum);
    }
}


