package pl.pp;

public class DeliveryVan extends Vehicle implements ElectricVehicle
{
    private int loadCapacity;
    private int chargingTime;

    public DeliveryVan(String registrationNumber, String vinNumber, String color, String fuelConsumption, String fuelLevel, int mileage, int loadCapacity, int chargingTime) {
        super(registrationNumber, vinNumber, color, fuelConsumption, fuelLevel, mileage);
        this.loadCapacity = loadCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electric Delivery Van: " + registrationNumber + ", Load: " + loadCapacity + " kg, Charging time: " + chargingTime + "h");
    }

    @Override
    public void charge() {
        System.out.println("Charging delivery van: " + registrationNumber);
    }
}