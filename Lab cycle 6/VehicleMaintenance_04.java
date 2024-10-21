import java.util.Scanner;

interface Vehicle {
    void start();
    void stop();
}

interface Maintenance {
    void scheduleMaintenance();
}

class Car implements Vehicle, Maintenance {
    String model;
    int year;
    boolean isRunning;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.isRunning = false;
    }

    @Override
    public void start() {
        isRunning = true;
        System.out.println("The car is starting.");
    }

    @Override
    public void stop() {
        isRunning = false;
        System.out.println("The car has stopped.");
    }

    @Override
    public void scheduleMaintenance() {
        System.out.println("Maintenance scheduled for the car.");
    }

    void displayInfo() {
        System.out.println("\n---------------------------\n");
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Is Running: " + (isRunning ? "Yes" : "No"));
        System.out.println("\n---------------------------\n");
    }
}

public class VehicleMaintenance_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        System.out.print("Enter car year: ");
        int year = scanner.nextInt();

        Car car = new Car(model, year);

        car.displayInfo();
        car.start();
        car.displayInfo();

        car.scheduleMaintenance();
        car.stop();
        car.displayInfo();

        scanner.close();
    }
}
