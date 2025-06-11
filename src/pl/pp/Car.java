package pl.pp;

public class Car extends Vehicle implements CombustionVehicle
{
    private int numberOfDoors;

    public Car(String registrationNumber, String vinNumber, String color, String fuelConsumption, String fuelLevel, int mileage, int numberOfDoors) {
        super(registrationNumber, vinNumber, color, fuelConsumption, fuelLevel, mileage);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car: " + registrationNumber + ", VIN: " + vinNumber + ", Color: " + color + ", Doors: " + numberOfDoors);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling car: " + registrationNumber);
    }
}