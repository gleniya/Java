package JavaAccentureFinal.module10.activity2;

import JavaAccentureFinal.module10.activity1.Person;

import java.util.List;

/**
 * @author Gleniya paul
 */
// 2.2 Employee class extends Person class using Inheritance
public class Employee extends Person {

    // 2.1.2 declaring attributes for employee class
    private String jobTitle;
    private String company;
    private double salary;

    // 2.1.3 constructor with no parameters
    public Employee(){
    }
    // Parameterized constructors to initialize class attributes
    public Employee(String jobTitle, String company, double salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    // 2.1.4  getter and setters for attributes for JobTitle, company,salary
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 2.1.5 override (polymorphism) the introduce() method from Person class
    @Override
    public void introduce() {
        // print out statement
        System.out.println("My name is " + getName() + " and I am " + getAge() + " years old" );
        System.out.println("I am work as " + jobTitle + " in " + company + " and my salary is "+ salary);
    }

    // 4.3 Method  for returning the highest paid employee (from activity 4)
    public static String getHighestPaidEmp(List<Employee> employeeList){
        // Assuming the first index employee has highest salary
        Employee highestPaid = employeeList.get(0);
        for(Employee emp : employeeList){
            // condition to check the current index has highest salary than the assumed one, then store that in highest paid
            if(emp.getSalary() > highestPaid.getSalary()){
                highestPaid = emp;
            }
        }
        return highestPaid.getName() + " with salary " + highestPaid.getSalary();

    }

}
