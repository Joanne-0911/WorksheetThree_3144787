package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShapeTest {

	private static final double EPSILON = 0.0001;

	@Test
    public void testCircle() {
        Circle circle = new Circle("Circle", 3.5);
        
        assertEquals(38.48451000647496, circle.area(), 0); // Using EPSILON = 0
        assertEquals(21.991148575128552, circle.perimeter(), 0);
        assertEquals("Shape: Circle, Radius: 3.5", circle.toString());
    }

    @Test
    public void testRhombus() {
    	Rhombus rhombus = new Rhombus("Rhombus", 6.0, 8.0, 5.0);
        assertEquals(24.0, rhombus.area(), EPSILON);
        assertEquals(20.0, rhombus.perimeter(), EPSILON);
        assertEquals("Shape: Rhombus, Diagonal1: 6.0, Diagonal2: 8.0, Side: 5.0", rhombus.toString());
    	 
        
    }

    @Test
    public void testRightAngledTriangle() {
    	 RightAngledTriangle triangle = new RightAngledTriangle("Triangle", 3.0, 4.0, 5.0);
         assertEquals(6.0, triangle.area(), EPSILON);
         assertEquals(12.0, triangle.perimeter(), EPSILON);
         assertEquals("Shape: Triangle, Base: 3.0, Height: 4.0, Hypotenuse: 5.0", triangle.toString());

        
    }
}
