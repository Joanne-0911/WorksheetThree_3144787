package griffith;

public class Rhombus extends Shape {
    private double diagonal1, diagonal2, side;

    public Rhombus(String name, double diagonal1, double diagonal2, double side) {
        super(name);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.side = side;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public double getSide() {
        return side;
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
        return "Shape: " + getName() + ", Diagonal1: " + diagonal1 + ", Diagonal2: " + diagonal2 + ", Side: " + side;
    }
}
