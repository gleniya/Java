package JavaAccentureFinal.module10.activity4;

import JavaAccentureFinal.module10.activity2.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gleniya paul
 */
// Fourth activity class name with employeeList
public class EmployeeList {
    public static void main(String[] args) {

        // 4.1  five employee object using the constructor
        Employee employee1 = new Employee("Developer", "Accenture", 1800);
        Employee employee2 = new Employee("Analyst", "Accenture", 1200);
        Employee employee3 = new Employee("Engineer", "Accenture", 1900);
        Employee employee4 = new Employee("Developer", "Accenture", 1500);
        Employee employee5 = new Employee("Frontend Developer", "Accenture", 1700);

        // 4.2 creating list with employee
        List<Employee> employeeList = new ArrayList<Employee>();
        // Adding all values to list using add and the object reference name
        employeeList.add(employee1);
        employee1.setName("Ann");
        employeeList.add(employee2);
        employee2.setName("john");
        employeeList.add(employee3);
        employee3.setName("Dominic");
        employeeList.add(employee4);
        employee4.setName("Sarah");
        employeeList.add(employee5);
        employee5.setName("Annaa");

        // 4.4 Print statement for highest salary method from employee class
        System.out.println("The highest salary of employee : " + Employee.getHighestPaidEmp(employeeList));

    }
}
