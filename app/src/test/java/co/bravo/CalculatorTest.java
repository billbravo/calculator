package co.bravo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test void testAddEquals() {
        Calculator calculator = new Calculator();
        calculator.setTerm(2);
        calculator.add();
        calculator.equals();
        assertEquals(4, calculator.getResult());
        calculator.equals();
        assertEquals(6, calculator.getResult());
        calculator.equals();
        assertEquals(8, calculator.getResult());
    }
    
    @Test void testAddTermEquals() {
        Calculator calculator = new Calculator();
        calculator.setTerm(2);
        calculator.add();
        calculator.setTerm(1);
        calculator.equals();
        assertEquals(3, calculator.getResult());
        calculator.equals();
        assertEquals(4, calculator.getResult());
        calculator.equals();
        assertEquals(5, calculator.getResult());
    }
    
    @Test void testAddAddAdd() {
        Calculator calculator = new Calculator();
        calculator.setTerm(2);
        calculator.add();
        calculator.setTerm(1);
        calculator.add();
        assertEquals(3, calculator.getResult());
        calculator.setTerm(2);
        calculator.add();
        assertEquals(5, calculator.getResult());
        calculator.setTerm(6);
        calculator.equals();
        assertEquals(11, calculator.getResult());
    }

    @Test void testMinusEquals() {
        Calculator calculator = new Calculator();
        calculator.setTerm(2);
        calculator.minus();
        calculator.equals();
        assertEquals(0, calculator.getResult());
        calculator.equals();
        assertEquals(-2, calculator.getResult());
        calculator.equals();
        assertEquals(-4, calculator.getResult());
    }

    @Test void testMinusTermEquals() {
        Calculator calculator = new Calculator();
        calculator.setTerm(5);
        calculator.minus();
        calculator.setTerm(1);
        calculator.equals();
        assertEquals(4, calculator.getResult());
        calculator.equals();
        assertEquals(3, calculator.getResult());
        calculator.equals();
        assertEquals(2, calculator.getResult());
    }

    @Test void testMinusMinusMinus() {
        Calculator calculator = new Calculator();
        calculator.setTerm(10);
        calculator.minus();
        calculator.setTerm(2);
        calculator.minus();
        assertEquals(8, calculator.getResult());
        calculator.setTerm(3);
        calculator.minus();
        assertEquals(5, calculator.getResult());
        calculator.setTerm(2);
        calculator.equals();
        assertEquals(3, calculator.getResult());
    }

    @Test void testMultiplyEquals() {
        Calculator calculator = new Calculator();
        calculator.setTerm(2);
        calculator.multiply();
        calculator.equals();
        assertEquals(4, calculator.getResult());
        calculator.equals();
        assertEquals(8, calculator.getResult());
        calculator.equals();
        assertEquals(16, calculator.getResult());
    }

    @Test void testMultiplyTermEquals() {
        Calculator calculator = new Calculator();
        calculator.setTerm(3);
        calculator.multiply();
        calculator.setTerm(2);
        calculator.equals();
        assertEquals(6, calculator.getResult());
        calculator.equals();
        assertEquals(12, calculator.getResult());
        calculator.equals();
        assertEquals(24, calculator.getResult());
    }

    @Test void testMultiplyMultiplyMultiply() {
        Calculator calculator = new Calculator();
        calculator.setTerm(2);
        calculator.multiply();
        calculator.setTerm(3);
        calculator.multiply();
        assertEquals(6, calculator.getResult());
        calculator.setTerm(2);
        calculator.multiply();
        assertEquals(12, calculator.getResult());
        calculator.setTerm(3);
        calculator.equals();
        assertEquals(36, calculator.getResult());
    }
    
}
