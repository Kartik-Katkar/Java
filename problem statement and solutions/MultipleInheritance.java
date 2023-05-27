import java.util.Scanner;

interface Account {
    void set(String accName, int accNumber, double balance);
    void display();
}

interface Person_x {
    void store(String name);
    void disp();
}

class Customer implements Person_x, Account {
    private String name;
    private int accNumber;
    private double balance;

    public void set(String accName, int accNumber, double balance) {
        this.name = accName;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Information");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest: $" + calculateInterest());
    }

    public void store(String name) {
        this.name = name;
    }

    public void disp() {
        System.out.println("Person Information");
        System.out.println("Name: " + name);
    }

    private double calculateInterest() {
        return balance * 0.05; // Assuming 5% interest rate
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Customer customer = new Customer();

        int choice = 0;
        while (choice != 5) {
            System.out.println("Menu:");
            System.out.println("1. Set Account Information");
            System.out.println("2. Display Account Information");
            System.out.println("3. Set Person Information");
            System.out.println("4. Display Person Information");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter account name: ");
                    String accName = scanner.nextLine();

                    System.out.print("Enter account number: ");
                    int accNumber = scanner.nextInt();

                    System.out.print("Enter account balance: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine();

                    customer.set(accName, accNumber, balance);

                    System.out.println("Account information set.");
                    break;
                case 2:
                    customer.display();
                    break;
                case 3:
                    System.out.print("Enter person name: ");
                    String personName = scanner.nextLine();

                    customer.store(personName);

                    System.out.println("Person information set.");
                    break;
                case 4:
                    customer.disp();
                    break;
                case 5:
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

