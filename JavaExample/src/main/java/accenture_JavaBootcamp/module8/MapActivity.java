package accenture_JavaBootcamp.module8;

// Needs to be completed
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapActivity {
    public static void main(String[] args) {
        // 1 - Type code to create a HashMap of key-value pairs
        // where key is id of type String and value is a name
        Map students = new HashMap();
        students.put("1", "Gleniya");
        students.put("2", "John");
        students.put("3", "Doe");

        // 2 - Call print method to print the map passed as its parameter.
        // (Hint: Notice print() is a non-static method, so create an instance of MapActivity)
        MapActivity activity = new MapActivity();
        activity.print(students);

    }

    void print(Map map) {
        // 3 - Type code to print this map (keys and values)
       // Set keySet = map.keySet();
        System.out.println("key\tvalue");
        for(Object key: map.keySet()){
            System.out.println(key + "\t" + map.get(key));
        }



    }
}
