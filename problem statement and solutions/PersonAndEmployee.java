import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    private int employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}

public class PersonAndEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter person's first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter person's last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter employee's job title: ");
        String jobTitle = scanner.nextLine();

        Person person = new Person(firstName, lastName);
        System.out.println("Person: " + person.getFirstName() + " " + person.getLastName());

        Employee employee = new Employee(firstName, lastName, employeeId, jobTitle);
        System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName() + ", Employee ID: " + employee.getEmployeeId());

        scanner.close();
    }
}
