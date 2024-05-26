import java.util.LinkedHashMap;

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
    }
}
