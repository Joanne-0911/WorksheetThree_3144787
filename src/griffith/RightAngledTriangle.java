package griffith;

public class RightAngledTriangle extends Shape {
    private double base, height, hypotenuse;

    public RightAngledTriangle(String name, double base, double height, double hypotenuse) {
        super(name);
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getHypotenuse() {
        return hypotenuse;
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
        return "Shape: " + getName() + ", Base: " + base + ", Height: " + height + ", Hypotenuse: " + hypotenuse;
    }
}
