package com.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(4, 3);
        assertEquals(12, result);
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(6, 3);
        assertEquals(2.0, result, 0.001);
    }


}
