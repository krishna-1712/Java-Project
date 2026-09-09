class Vehicle {
    String brand;
    int year;

    void startEngine() {
        System.out.println("starting the engine");
    }

}

class Car extends Vehicle {
    String fuelType;

    @Override
    void startEngine() {
        System.out.println("Car engine starts");

    }

    void drive() {
        System.out.println("car is driving");
    }

}

class Truck extends Vehicle {
    int loadCapacity;

    @Override
    void startEngine() {
        System.out.println("Truck engine start");
    }

    void haul() {
        System.out.println("Truck is hauling");
    }
}

public class Task_Vehicle {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.year = 2005;
        c1.fuelType = "Diesel";

        c1.startEngine();
        c1.drive();

        Truck t1 = new Truck();
        t1.brand = "TATA";
        t1.year = 2006;
        t1.loadCapacity = 500;
        t1.startEngine();

        t1.haul();

    }

}