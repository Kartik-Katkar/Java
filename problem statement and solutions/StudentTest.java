import java.util.Scanner;

// Custom exception for age not within the range
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom exception for name not valid
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21.");
        }

        if (name.matches(".*\\d.*") || !name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Name contains numbers or special symbols.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

// Main class for menu-driven program
public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 2);

        scanner.close();
    }

    private static void addStudent(Scanner scanner) {
        try {
            // Input student details from the user
            System.out.print("Enter roll number: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character

            System.out.print("Enter course: ");
            String course = scanner.nextLine();

            // Create the student object
            Student student = new Student(rollNo, name, age, course);

            // Print student details
            System.out.println("Student details:");
            System.out.println("Roll No: " + student.getRollNo());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Course: " + student.getCourse());
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        }
    }
}
