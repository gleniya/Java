package accenture_JavaBootcamp.module2;

/**
 * @author Gleniya paul
 */
public class Calculator {

    private String calculatorType;
    public static final String CALC_TYPE_BASIC = "Basic";
    // -----Default constructor
    public Calculator(){
        this.calculatorType = CALC_TYPE_BASIC;
    }
    // -----Parameterized constructor accepting calculatorType
    public Calculator(String calculatorType) {
        this.calculatorType = calculatorType;
    }
    // ------ Getter for CalculatorType
    public String getCalculatorType() {
        return calculatorType;
    }

    //------Setter for CalculatorType
    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    // Add
    public int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    // Subtract (Handles absolute or conditional difference)
    public int subtract(int x, int y) {
        int diff = 0;
        if (x > y) {
            diff = x - y;
        } else {
            diff = y - x;
        }
        return diff;
    }
    //multiplication
    public int multiply(int[] numbers) {
        int temp = 1;

        for (int i = 0; i < numbers.length; i++) {
            temp = temp * numbers[i];
        }
        return temp;
    }
    // division
    public int divide(int x, int y) {
        int divValue = 0;
        if(y != 0){
            divValue= x/y;
        }
        else{
            System.out.println("The value of y is zero");
        }
        return divValue;
    }
}

