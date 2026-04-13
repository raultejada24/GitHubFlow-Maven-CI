package es.codeurjc.demo;
import junit.framework.TestCase;
public class CalculatorTest extends TestCase {
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }
    public void testAddNegative() {
        Calculator calc = new Calculator();
        try {
            calc.add(-1, 5);
            fail("Expected an exception");
        } catch (IllegalArgumentException e) {
            assertEquals("No negative numbers allowed!", e.getMessage());
        }
    }
}
