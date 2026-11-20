package JavaAccentureFinal.module10.activity5;

import java.util.HashMap;
/**
 * @author Gleniya paul
 */
// activity 5
public class ElectronicItemDetails {
    // 5.3 main method
    public static void main(String[] args) {

        // 5.1 Hash map with string name and double price
        HashMap<String, Double> itemHashMap = new HashMap<>();

       // 5.3.1 Adding four items to hashmap
        itemHashMap.put("TV",550.0);
        itemHashMap.put("Refrigerator",890.0);
        itemHashMap.put("Washing Machine",450.0);
        itemHashMap.put("Laptop",1200.0);

        // object creation for method returnPriceOfItems
        ElectronicItemDetails details = new ElectronicItemDetails();
        // 5.3.2 print statement for returnPriceOfItems
        System.out.println("Price Of TV is " + details.returnPriceOfItems(itemHashMap,"TV"));
    }

    // 5.2 method returnPriceOfItems
    public double returnPriceOfItems(HashMap<String,Double> itemHashMap, String name){
        return itemHashMap.get(name);
    }
}
