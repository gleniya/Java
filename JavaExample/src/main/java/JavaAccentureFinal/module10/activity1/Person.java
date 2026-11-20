package JavaAccentureFinal.module10.activity1;
/**
*@author Gleniya paul
 *
 **/
// 1. Abstract person class with abstract keyword
public abstract class Person {

    // 1.1 attributes declaration for name, age
    private String name;
    private int age;

    // 1.2  getter gets the name and return name setter updates the value
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        //conditions to check invalid age inputs
        if(age >= 0){
            this.age = age;
        } else {
            System.out.println("age cannot negative number");
        }

    }
    // 1.3 abstract method
    public abstract void introduce();

}
