package pl.pp;

public abstract class Vehicle
{
    protected String registrationNumber;
    protected String vinNumber;
    protected String color;
    protected String fuelConsumption;
    protected String fuelLevel;
    protected int mileage;

    public Vehicle(String registrationNumber, String vinNumber, String color, String fuelConsumption, String fuelLevel, int mileage) {
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
        this.color = color;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;
    }

    public abstract void displayInfo();
}