package accenture_JavaBootcamp.module8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListActivity {

// Needs to be completed
        public static void main(String[] args) {
            // TODO: 1 - Type code to create a list of names. Use ArrayList.
            // Add "John", "John", "Harry", and "Daniel" to the list.
            List<String> names = new ArrayList<>();
            names.add("John");
            names.add("John");
            names.add("Harry");
            names.add("Daniel");
            // TODO: 2 - Call print method to print the list passed as its parameter.
            print(names);
        }
        static void print(List list) {
            // TODO: 3 - Type code to print this list
            // Notice the order in which elements get printed.
            Iterator<String> iterate = list.iterator();
            while(iterate.hasNext()){
                System.out.println(iterate.next());
            }

        }
}
