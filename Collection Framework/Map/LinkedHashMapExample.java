import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("House", 1);
        linkedHashMap.put("Igloo", 2);
        linkedHashMap.put("Jungle", 3);

        System.out.println("\nLinkedHashMap:");
        System.out.println("Initial Map: " + linkedHashMap);

        // Additional operations for LinkedHashMap
        // Check if the map contains a key
        System.out.println("Contains key 'Igloo': " + linkedHashMap.containsKey("Igloo"));

        // Check if the map contains a value
        System.out.println("Contains value 2: " + linkedHashMap.containsValue(2));

        // Get the size of the map
        System.out.println("Size of the map: " + linkedHashMap.size());

        // Clear the map
        linkedHashMap.clear();
        System.out.println("After clearing the map: " + linkedHashMap);

        // Get a set of all keys
        linkedHashMap.put("House", 1);
        linkedHashMap.put("Igloo", 2);
        linkedHashMap.put("Jungle", 3);
        Set<String> keys = linkedHashMap.keySet();
        System.out.println("All keys: " + keys);

    

        // Get a set of all key-value pairs
        Set<Map.Entry<String, Integer>> entries = linkedHashMap.entrySet();
        System.out.println("All key-value pairs: " + entries);
    }
}
