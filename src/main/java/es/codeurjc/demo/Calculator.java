package es.codeurjc.demo;
public class Calculator {
    public int add(int a, int b) { 
        if (a < 0 || b < 0) throw new IllegalArgumentException("No negative numbers allowed!");
        return a + b; 
    }
}
