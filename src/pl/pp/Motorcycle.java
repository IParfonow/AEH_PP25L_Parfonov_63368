package pl.pp;

public class Motorcycle extends Vehicle implements CombustionVehicle
{
    private int engineCapacity;

    public Motorcycle(String registrationNumber, String vinNumber, String color, String fuelConsumption, String fuelLevel, int mileage, int engineCapacity) {
        super(registrationNumber, vinNumber, color, fuelConsumption, fuelLevel, mileage);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle: " + registrationNumber + ", Engine: " + engineCapacity + "cc");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling motorcycle: " + registrationNumber);
    }
}