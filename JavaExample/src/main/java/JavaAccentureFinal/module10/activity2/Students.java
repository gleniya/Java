package JavaAccentureFinal.module10.activity2;

import JavaAccentureFinal.module10.activity1.Person;

/**
 * @author Gleniya paul
 */

// 2.2.3  Students class extends Person class
public class Students extends Person {

    // 2.2.1  declaring Attribute
    private String schoolName;

    // 2.2.2 getter and setter for the attribute
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // 2.2.4 override introduce method to Student class
    @Override
    public void introduce() {
        System.out.println("I am study in university "+ schoolName);
    }
}
