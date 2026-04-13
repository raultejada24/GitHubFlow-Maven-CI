package es.codeurjc.demo;
import junit.framework.TestCase;
public class CalculatorTest extends TestCase {
    public void testAdd() { assertEquals(5, new Calculator().add(2, 3)); }
    public void testSubtract() { assertEquals(4, new Calculator().subtract(10, 6)); }
    public void testMultiply() { assertEquals(21, new Calculator().multiply(3, 7)); }
    public void testDivide() { assertEquals(2.0, new Calculator().divide(10, 5)); }
    public void testDivideByZero() {
        try { new Calculator().divide(10, 0); fail(); } catch (ArithmeticException e) {
            assertEquals("Cannot divide by zero!", e.getMessage());
        }
    }
}
