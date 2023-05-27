import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private String designation;
    private double salary;

    public Employee(String name, int age, String designation, double salary) {
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[5];

        int choice = 0;
        while (choice != 3) {
            System.out.println("Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. List Employees with Salary > 5000");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addEmployee(scanner, employees);
                    break;
                case 2:
                    listEmployeesWithSalaryGreaterThan(employees, 5000);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }

    public static void addEmployee(Scanner scanner, Employee[] employees) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Designation: ");
            String designation = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            employees[i] = new Employee(name, age, designation, salary);
            System.out.println();
        }
    }

    public static void listEmployeesWithSalaryGreaterThan(Employee[] employees, double threshold) {
        System.out.println("Employees with salary greater than " + threshold + ":");
        boolean found = false;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > threshold) {
                System.out.println("Employee Name: " + employee.name + "  |  Salary: " + employee.getSalary());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found with salary greater than " + threshold);
        }
    }
}
