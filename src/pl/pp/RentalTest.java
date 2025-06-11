package pl.pp;

public class RentalTest
{
    public static void main(String[] args) {
        Car car = new Car("WE12345", "VIN123", "Black", "8l", "40%", 120000, 4);
        Motorcycle motorcycle = new Motorcycle("DW67890", "VIN456", "Red", "5l", "70%", 45000, 500);
        DeliveryVan van = new DeliveryVan("GD54321", "VIN789", "White", "0", "80%", 80000, 1200, 3);

        car.displayInfo();
        car.refuel();

        motorcycle.displayInfo();
        motorcycle.refuel();

        van.displayInfo();
        van.charge();
    }
}