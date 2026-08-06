// Abstract class
// An abstract class cannot be instantiated (objects cannot be created directly).
abstract class Vehicle {

    // Data member (common to all vehicles)
    String brand;

    // Constructor
    Vehicle(String brand) {
        this.brand = brand;
    }

    // Concrete method
    // This method already has an implementation.
    void displayBrand() {
        System.out.println("Brand: " + brand);
    }

    // Abstract method
    // No implementation is provided here.
    // Every subclass MUST provide its own implementation.
    abstract void startEngine();
}

// Child class
class Car extends Vehicle {

    // Constructor
    Car(String brand) {
        super(brand);      // Calls the constructor of Vehicle
    }

    // Implementation of abstract method
    @Override
    void startEngine() {
        System.out.println("Car engine starts using a key or push button.");
    }
}

// Main class
public class AbstractClassDemo {

    public static void main(String[] args) {

        // Vehicle v = new Vehicle("Toyota");
        // ERROR: Cannot create an object of an abstract class.

        // Create an object of the child class
        Car c = new Car("Toyota");

        // Call the concrete method inherited from Vehicle
        c.displayBrand();

        // Call the implemented abstract method
        c.startEngine();
    }
}
