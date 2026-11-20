package JavaAccentureFinal.module10;

import JavaAccentureFinal.module10.activity3.InvalidInputException;

/**
 * @author gleniya paul
 */

// 3.1 calculator class
public class Calculator {

    // 3.1.1 two method overloading with same name and 2 parameters
    public int add(int a, int b){
        return a + b;
    }
    // overloading with same name and 3 parameters
     public int add(int a, int b, int c){
        return a + b + c;
     }

     // 3.1.2 subtract method
    public int subtract(int a, int b){
        return a - b;
    }

    //3.1.3 divide method with java exception
    public int divide(int a, int b){
        int result = 0;
        try {
            if (b == 0){
                throw new ArithmeticException("number cannot divide by zero");
            }
            result =a/b;
        }
        catch(ArithmeticException arithmeticException){
            System.out.println("invalid inputs" + arithmeticException.getMessage());
        }
        return result;
    }
    // 3.1.4 multiply method with customized exception
    public int multiply(int a, int b) throws InvalidInputException {
        int result = 0;
        try {
            if (a < 0 || b < 0){
                throw new InvalidInputException();
            }
            result = a * b;
        }
        catch (InvalidInputException invalidInputException){
            System.out.println(invalidInputException.getMessage());
        }
        return result;

    }


}
