import java.util.Scanner;

abstract class Marks {
    abstract float getPercentage();
}

class A extends Marks {
    private int subject1;
    private int subject2;
    private int subject3;

    public A(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public float getPercentage() {
        float totalMarks = subject1 + subject2 + subject3;
        return (totalMarks / 300) * 100;
    }
}

class B extends Marks {
    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;

    public B(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    public float getPercentage() {
        float totalMarks = subject1 + subject2 + subject3 + subject4;
        return (totalMarks / 400) * 100;
    }
}

public class PercentageOfMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Calculate percentage for Student A");
            System.out.println("2. Calculate percentage for Student B");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("\nEnter marks for Student A (out of 100):");
                    System.out.print("Subject 1: ");
                    int subject1A = scanner.nextInt();
                    System.out.print("Subject 2: ");
                    int subject2A = scanner.nextInt();
                    System.out.print("Subject 3: ");
                    int subject3A = scanner.nextInt();

                    A studentA = new A(subject1A, subject2A, subject3A);
                    float percentageA = studentA.getPercentage();
                    System.out.println("\nPercentage of Student A: " + percentageA + "%");
                    break;
                case 2:
                    System.out.println("\nEnter marks for Student B (out of 100):");
                    System.out.print("Subject 1: ");
                    int subject1B = scanner.nextInt();
                    System.out.print("Subject 2: ");
                    int subject2B = scanner.nextInt();
                    System.out.print("Subject 3: ");
                    int subject3B = scanner.nextInt();
                    System.out.print("Subject 4: ");
                    int subject4B = scanner.nextInt();

                    B studentB = new B(subject1B, subject2B, subject3B, subject4B);
                    float percentageB = studentB.getPercentage();
                    System.out.println("\nPercentage of Student B: " + percentageB + "%");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
            scanner.nextLine(); // Consume the newline character
        }
    }
}
