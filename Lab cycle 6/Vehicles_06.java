class Vehicle {
    void start() {
        System.out.println("Starting vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Starting car");
    }
}

class Truck extends Vehicle {
    @Override
    void start() {
        System.out.println("Starting truck");
    }
}

public class Vehicles_06 {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car();
        vehicles[1] = new Truck();

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }
}
