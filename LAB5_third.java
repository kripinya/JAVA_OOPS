//lab5_third 
/*
 * //3) A vehicle manufacturing company produces different types of vehicles, such as cars and motorcycles. The base class Vehicle contains common properties like brand, model, and price. The class Car extends Vehicle by adding attributes like seatingCapacity and fuelType. Further, a subclass ElectricCar extends Car, introducing additional attributes like batteryCapacity and chargingTime. The Motorcycle class extends Vehicle and adds engineCapacity and type (e.g., "Sport", "Cruiser"). 
 * Implement this vehicle hierarchy system using multilevel inheritance in Java. 
 * Use constructor chaining to initialize attributes efficiently and demonstrate polymorphism by 
 * overriding a method displayDetails() in each subclass.
 */
// Base class Vehicle
class Vehicle {

    protected String brand;
    protected String model;
    protected double price;

    // Constructor
    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display details (to be overridden in subclasses)
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}

// Subclass Car extending Vehicle
class Car extends Vehicle {

    protected int seatingCapacity;
    protected String fuelType;

    // Constructor chaining
    public Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass ElectricCar extending Car
class ElectricCar extends Car {

    private int batteryCapacity;
    private double chargingTime;

    // Constructor chaining
    public ElectricCar(String brand, String model, double price, int seatingCapacity, String fuelType, int batteryCapacity, double chargingTime) {
        super(brand, model, price, seatingCapacity, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

// Subclass Motorcycle extending Vehicle
class Motorcycle extends Vehicle {

    private int engineCapacity;
    private String type; // e.g., Sport, Cruiser

    // Constructor chaining
    public Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
        super(brand, model, price);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("Type: " + type);
    }
}

// Main class to test the hierarchy
public class LAB5_third {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic", "Base Model", 15000);
        Car car = new Car("Hyundai", "Venue", 15000, 5, "Petrol");
        ElectricCar eCar = new ElectricCar("Tesla", "Model S", 80000, 5, "Electric", 100, 1.5);
        Motorcycle bike = new Motorcycle("Harley-Davidson", "Street 750", 7500, 750, "Cruiser");

        System.out.println("\nVehicle Details:");
        vehicle.displayDetails();

        System.out.println("\nCar Details:");
        car.displayDetails();

        System.out.println("\nElectric Car Details:");
        eCar.displayDetails();

        System.out.println("\nMotorcycle Details:");
        bike.displayDetails();
    }
}
