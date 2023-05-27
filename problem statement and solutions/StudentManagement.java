import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private String grade;
    private List<String> courses;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public void addCourse(String course) {
        courses.add(course);
        System.out.println("Course added: " + course);
    }

    public void removeCourse(String course) {
        if (courses.remove(course)) {
            System.out.println("Course removed: " + course);
        } else {
            System.out.println("Course not found: " + course);
        }
    }

    public void displayCourses() {
        System.out.println("Courses for " + name + ":");
        for (String course : courses) {
            System.out.println(course);
        }
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        int choice = 0;
        while (choice != 4) {
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter student grade: ");
                    String grade = scanner.nextLine();

                    Student student = new Student(name, grade);
                    students.add(student);

                    System.out.println("Student Name: " + name + " with grade " + grade + " added Successfully!");
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = scanner.nextLine();

                    boolean removed = false;
                    for (Student s : students) {
                        if (s.getName().equals(nameToRemove)) {
                            students.remove(s);
                            removed = true;
                            System.out.println("Student Name: " + nameToRemove + " removed Successfully!");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Student not found: " + nameToRemove);
                    }
                    break;
                case 3:
                    System.out.println("List of students:");
                    for (Student s : students) {
                        System.out.println("Name: " + s.getName() + ", Grade: " + s.getGrade());
                    }
                    break;
                case 4:
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
}
