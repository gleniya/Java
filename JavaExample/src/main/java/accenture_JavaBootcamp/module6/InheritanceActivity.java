package accenture_JavaBootcamp.module6;

public class InheritanceActivity {
    /**
     * @author gleniya paul
     * Activity 1
     */

        public static void main(String[] args) {

            // TODO: Create Person_I object myPerson and set name as "Sarah Johnson" and age as 21
            Person_I person = new Person_I();
            person.setName("Sarah Johnson");
            person.setAge(21);

            System.out.println("-----------------------------");
            // TODO: Create Employee_I object myEmployee and
            // set salary as 70000.00, title as "Developer", age as 32 and name as "Shawn Cun"
            Employee_I employee = new Employee_I();
            employee.setSalary(70000.00);
            employee.setTitle("Developer");
            employee.setAge(32);
            employee.setName("Shawn Cun");

            // Print Info using Employee object
            System.out.println("-----------------------------");
            // TODO: Uncomment the lines below once myEmployee is created

        System.out.println("Employee's Name is   : " + employee.getName());
        System.out.println("Employee's Age is    : " + employee.getAge());
        System.out.println("Employee's Title is  : " + employee.getTitle());
        System.out.println("Employee's Salary is : " + employee.getSalary());

            // Print Info using Person object
            System.out.println("-----------------------------");
            // TODO: Uncomment the lines below once myPerson is created

        System.out.println("Person's Name is    : " + person.getName());
        System.out.println("Person's Age is     : " + person.getAge());
        }

}
