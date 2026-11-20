package JavaAccentureFinal.module10.activity3;

import JavaAccentureFinal.module10.Calculator;
import JavaAccentureFinal.module10.activity3.InvalidInputException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// 3.2 calculator test class
public class CalculatorTest {

    // object for Calculator class
    Calculator calculator = new Calculator();

    // 3.2.1 4 test cases for add method
    @Test
    public void testAddTwoNumbersPositive(){
        assertEquals(15,calculator.add(10,5));
    }
    @Test
    public void testAddThreeNumbersPositive(){
        assertEquals(20,calculator.add(10,5,5));
    }
    @Test
    public void testAddTwoNumbersNegative(){
        assertEquals(-15,calculator.add(-10,-5));
    }
    @Test
    public void testAddThreeNumbersWithZero(){
        assertEquals(12,calculator.add(12,0,0));
    }
    // test for subtract method
    @Test
    public void testSubtractTwoNumbersPositive(){
        assertEquals(5,calculator.subtract(10,5));
    }
    @Test
    public void testSubtractTwoNumbersNegative(){
        assertEquals(-5,calculator.subtract(5,10));
    }
    //3.2.2 Test cases for divide method
    @Test
    public void testDivideByValidNum(){
        assertEquals(5,calculator.divide(10,2));
    }
    @Test
    public void testDivideByZero(){
        assertEquals(0,calculator.divide(10,0));
    }
    // multiplication method
    @Test
    public void testMultplyByValidNum() throws InvalidInputException {
        assertEquals(10,calculator.multiply(2,5));
    }
    @Test
    public void testMultplyByInValidNum() throws InvalidInputException {
        assertEquals(0,calculator.multiply(-4,5));
    }



}
