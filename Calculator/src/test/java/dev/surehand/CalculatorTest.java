package dev.surehand;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    double a = 6.345;
    double b = 0.123;
    int x = 5;
    int y = 2;

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        double expResult = 6.468;
        double result = calculator.add(a, b);
        assertEquals(expResult, result);
    }

    @Test
    void subtract() {
        double expResult = 6.222;
        double result = calculator.subtract(a, b);
        assertEquals(expResult, result);
    }

    @Test
    void multiply() {
        double expResult = 0.780435;
        double result = calculator.multiply(a, b);
        assertEquals(expResult, result);
    }

    @Test
    void divide() {
        double expResult = 51.58536585365854;
        double result = calculator.divide(a, b);
        assertEquals(expResult, result);
    }

    @Test
    void testAdd() {
        int expResult = 7;
        int result = calculator.add(x, y);
        assertEquals(expResult, result);
    }

    @Test
    void testSubtract() {
        int expResult = 3;
        int result = calculator.subtract(x, y);
        assertEquals(expResult, result);
    }

    @Test
    void testMultiply() {
        int expResult = 10;
        double result = calculator.multiply(x, y);
        assertEquals(expResult, result);
    }

    @Test
    void testDivide() {
        double expResult = 2.5;
        double result = calculator.divide(x, y);
        assertEquals(expResult, result);
    }

}