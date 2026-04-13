package es.codeurjc.demo;
import junit.framework.TestCase;
public class CalculatorTest extends TestCase {
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.subtract(10, 6));
    }
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(21, calc.multiply(3, 7));
    }
}
