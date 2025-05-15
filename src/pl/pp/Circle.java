package pl.pp;

public class Circle {
    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public void getInfo() {
        System.out.println("Circle with radius = " + radius +
                ", area = " + area() +
                ", circumference = " + circumference());
    }
}
