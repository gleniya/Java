package accenture_JavaBootcamp.module6.InterfaceActivity;

    // TODO: Cat class should implement Animal
public class Cat implements Animal {

        // TODO: Create method animalSound() and its implementation should print out string "Cat says: 'Meow Meow'!"

        @Override
        public void animalSound() {
            System.out.println("Cats says:'Meow Meow'! ");
        }

        // TODO: Create method sleep() and its implementation should print out string "Cat is sleeping!"

        @Override
        public void sleep() {
            System.out.println("Cat is sleeping!");
        }



    }

