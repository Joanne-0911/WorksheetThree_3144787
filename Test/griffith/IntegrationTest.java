package griffith;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class IntegrationTest {

    private static final double EPSILON = 0.0001;

    @Test
    public void testShapeIntegration() {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle("Circle1", 3.5));
        shapes.add(new Circle("Circle2", 2.0));
        shapes.add(new Rhombus("Rhombus1", 6.0, 8.0, 5.0));
        shapes.add(new Rhombus("Rhombus2", 4.0, 5.0, 3.0));
        shapes.add(new RightAngledTriangle("Triangle1", 3.0, 4.0, 5.0));
        shapes.add(new RightAngledTriangle("Triangle2", 5.0, 12.0, 13.0));

        for (Shape shape : shapes) {
            assertTrue(shape.area() > 0);
            assertTrue(shape.perimeter() > 0);
        }
    }
}
