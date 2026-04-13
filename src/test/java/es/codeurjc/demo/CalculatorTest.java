package es.codeurjc.demo;
import junit.framework.TestCase;
public class CalculatorTest extends TestCase {
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }
}
