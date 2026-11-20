package JavaAccentureFinal.module10.activity2;

/**
 * @author  Gleniya paul
 */

// 2.3 AbstractActivity class
public class AbstractActivity {
    public static void main(String[] args) {
        // 2.3.1 creating object for Employee and calling introduce() using object reference name employee
        Employee employee = new Employee();

        // before calling introduce method set values to variables
        employee.setName("Gleniya");
        employee.setAge(23);
        employee.setJobTitle("Developer");
        employee.setCompany("Accent");
        employee.setSalary(1200);
        employee.introduce();
        System.out.println("--------------------------");

        //2.3.2 create object for students and call introduce method
         Students student = new Students();

         student.setSchoolName("Riga university");
         student.introduce();

    }



}
