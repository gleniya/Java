package accenture_JavaBootcamp.module6;

public class Person_I {

        // Attributes
        private String name;
        private int age;
        // Behavior
        // TODO: Write default constructor. Print "I'm Person_I constructor"
        public Person_I(){
            System.out.println("I'm Person_I constructor");
        }
        // TODO: Write parameterized constructor with variables name and age
        public Person_I(int age, String name) {
        this.age = age;
        this.name = name;
         }

    // TODO: Write getter for String name

        public String getName() {
            return name;
        }
    // TODO: Write setter for String name

        public void setName(String name) {
            this.name = name;
        }

        // TODO: Write getter for int age
        public int getAge(){
              return age;
        }
        // TODO: Write setter for int age
        public int setAge(int age){
            this.age = age;
            return age;
        }

}
