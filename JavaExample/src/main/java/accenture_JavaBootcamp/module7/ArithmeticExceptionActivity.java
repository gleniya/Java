package accenture_JavaBootcamp.module7;

// Needs to be completed
public class ArithmeticExceptionActivity {

        //main method
        public static void main(String[] args) {
            // instance of ArithmeticExceptionActivity and call catchMe with 10 and 0

            ArithmeticExceptionActivity arithmeticExtnActivity = new ArithmeticExceptionActivity();
            arithmeticExtnActivity.catchMe(10,0);
            arithmeticExtnActivity.catchMe(10,2);
        }

        void catchMe(int num1, int num2) {

            // The following code results in an Exception.
            //  code to handle this exception.
            try {
                int result = num1 / num2;
                System.out.println("The result is :" + result);
            }

            catch (ArithmeticException ArithmeticException){
                System.out.println("Error Occurred: cannot divide by zero");
            }
            // prints a message "Thank you for using this program."
            finally {
                System.out.println("Thank you for using this program...:)");
            }



        }



}
