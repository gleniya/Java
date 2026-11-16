package accenture_JavaBootcamp.module2;

public class CalculatorClient {

        public static void main(String[] args) {

            // Instantiate Calculator using the basic type constant
            Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);

            System.out.println("*** Calculations will be performed using " + normalCalc.getCalculatorType() + " calculator ***");

            // Add
            int result = normalCalc.add(4, 5);
            System.out.println("1) Add result is " + result);

            // TODO: Complete code to multiply array {2, 3, 4} using normalCalc.multiply() and print result
            int[] nums = {2, 3, 4};
            int multiplicationResult= normalCalc.multiply(nums);
            System.out.println("2) multiply result is " + multiplicationResult);

            // TODO: Write code to divide 10 and 2 using normalCalc.divide() and print result
            int divideResult=normalCalc.divide(10,2);
            System.out.println("3) divide result is " + divideResult);

            // TODO: Write code to subtract 2 from 10 using normalCalc.subtract() and print result
            int substractionResult=normalCalc.subtract(2,10);
            System.out.println("4) substraction result is " + substractionResult);
        }
    }

