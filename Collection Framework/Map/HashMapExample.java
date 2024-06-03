import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        
        // HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);
       hashMap.put("Banana", 2);


        System.out.println("HashMap:");
        System.out.println("Initial Map: " + hashMap);

        // Additional operations for HashMap
        // Get the value for a key
        System.out.println("Value for 'Banana': " + hashMap.get("cherry"));    

        // Remove a key-value pair
        hashMap.remove("Cherry");
        System.out.println("After removing 'Cherry': " + hashMap);

        // Check if the map contains a key
        System.out.println("Contains key 'Banana': " + hashMap.containsKey("Banana"));

        // Check if the map contains a value
        System.out.println("Contains value 2: " + hashMap.containsValue(2));

        // Get the size of the map
        System.out.println("Size of the map: " + hashMap.size());

        // Clear the map
        hashMap.clear();
        System.out.println("After clearing the map: " + hashMap);

        // Get a set of all keys
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);
        Set<String> keys = hashMap.keySet();
        System.out.println("All keys: " + keys);

    

        // Get a set of all key-value pairs
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        System.out.println("All key-value pairs: " + entries);
    }
}
