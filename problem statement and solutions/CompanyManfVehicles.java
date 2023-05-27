import java.util.Scanner;

interface Vehicle {
    void move();
}

class Helicopter implements Vehicle {
    @Override
    public void move() {
        System.out.println("The helicopter flies in the air.");
    }
}

class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("The car drives on the road.");
    }
}

class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("The train runs on the track.");
    }
}

public class CompanyManfVehicles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Create Helicopter");
            System.out.println("2. Create Car");
            System.out.println("3. Create Train");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    Vehicle helicopter = new Helicopter();
                    helicopter.move();
                    break;
                case 2:
                    Vehicle car = new Car();
                    car.move();
                    break;
                case 3:
                    Vehicle train = new Train();
                    train.move();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        }
    }
}
