package lecture3.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    public void testGetRadiusOfUnitCircle() {
        double radius = 1;
        Circle circle = new Circle(radius);
        assertEquals(radius, circle.getRadius(), 0.1);
    }

    @Test
    public void testGetAreaOfUnitCircle() {
        double radius = 1;
        Circle circle = new Circle(radius);
        assertEquals(3.14, circle.getArea(), 0.1);
    }

    @Test
    public void testGetPerimeterOfUnitCircle() {
        double radius = 1;
        Circle circle = new Circle(radius);
        assertEquals(6.28, circle.getPerimeter(), 0.1);
    }

    @Test
    public void testGetRadius() {
        double radius = 3.15;
        Circle circle = new Circle(radius);
        assertEquals(radius, circle.getRadius(), 0.1);
    }

    @Test
    public void testGetArea() {
        double radius = 3.15;
        Circle circle = new Circle(radius);
        assertEquals(31.16, circle.getArea(), 0.1);
    }

    @Test
    public void testGetPerimeter() {
        double radius = 3.15;
        Circle circle = new Circle(radius);
        assertEquals(19.78, circle.getPerimeter(), 0.1);
    }
}