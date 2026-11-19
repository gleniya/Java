package accenture_JavaBootcamp.module7;

// Needs to be completed

// This program accepts a user name and checks user's validity

// The user name is checked against an array of names.
public class CustomExceptionActivityTest {

        // 1 - Type main method and call validateUser() from it.
        public static void main(String[] args) {
            CustomExceptionActivityTest test = new CustomExceptionActivityTest();
            try {
                test.validateUser("Paul");
                // Call this method with different names to test it.
                test.validateUser("Doe");
            }
            catch (CustomExceptionActivity e){
                System.out.println(e.getMessage());
            }

        }
        void validateUser(String name) throws CustomExceptionActivity{
            // Array of names
            String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};

            // Flag stores 1 if a match is found else it should remain 0
            int flag = 0;

            for (int i = 0; i < 4; i++) {
                // 2 - Write code to check if parameter name contains a value which is found in validUsers array and change flag's value accordingly
                if(validUsers[i].equalsIgnoreCase(name)){
                    flag = 1;
                }
            }
            // 3 - Check if flag is zero, throw CustomExceptionActivity Exception.
            if (flag == 0) {
                throw new CustomExceptionActivity();
            }
            else if (flag == 1){
                    // 4 - Else if flag is one, print a message "Welcome to Payroll program".
                    System.out.println("Welcome to Payroll program");
            }


        }



}
