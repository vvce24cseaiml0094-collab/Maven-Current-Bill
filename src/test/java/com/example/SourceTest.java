package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SourceTest {

    Source obj = new Source();

    @Test
    public void testFirstSlab() {
        assertEquals(120.0, obj.calculateBill(50), 0.001);
    }

    @Test
    public void testSecondSlab() {
        assertEquals(325.0, obj.calculateBill(150), 0.001);
    }

    @Test
    public void testThirdSlab() {
        assertEquals(650.0, obj.calculateBill(250), 0.001);
    }

    @Test
    public void testSlabBoundary() {
        assertEquals(200.0, obj.calculateBill(100), 0.001);
    }

    @Test
    public void testMultipleSlabs() {
        assertEquals(1100.0, obj.calculateBill(350), 0.001);
    }

    @Test
    public void testZeroUnits() {
        assertEquals(50.0, obj.calculateBill(0), 0.001);
    }

    @Test
    public void testNegativeUnits() {
        assertThrows(IllegalArgumentException.class,
                () -> obj.calculateBill(-10));
    }
}
