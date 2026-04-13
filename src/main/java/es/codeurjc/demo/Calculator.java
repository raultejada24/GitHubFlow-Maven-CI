package es.codeurjc.demo;
public class Calculator {
    public int add(int a, int b) { 
        if (a < 0 || b < 0) throw new IllegalArgumentException("No negative numbers allowed!");
        return a + b; 
    }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}
// Optimized for DevOps CI/CD Lifecycle
