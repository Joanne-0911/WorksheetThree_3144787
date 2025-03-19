package griffith;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // No implementation yet (TDD)
        return 0;
    }

    @Override
    public double perimeter() {
        // No implementation yet (TDD)
        return 0;
    }

    @Override
    public String toString() {
        return "Shape: " + getName() + ", Radius: " + radius;
    }
}
