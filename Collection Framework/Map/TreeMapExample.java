import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Elephant", 1);
        treeMap.put("Fox", 2);
        treeMap.put("Giraffe", 3);

        System.out.println("\nTreeMap:");
        System.out.println("Initial Map: " + treeMap);

        // Additional operations for TreeMap
        // Get the first key-value pair
        System.out.println("First entry: " + treeMap.firstEntry());

        // Get the last key-value pair
        System.out.println("Last entry: " + treeMap.lastEntry());

        // Get the size of the map
        System.out.println("Size of the map: " + treeMap.size());

        // Clear the map
        treeMap.clear();
        System.out.println("After clearing the map: " + treeMap);

        // Get a set of all keys
        treeMap.put("Elephant", 1);
        treeMap.put("Fox", 2);
        treeMap.put("Giraffe", 3);
        Set<String> keys = treeMap.keySet();
        System.out.println("All keys: " + keys);

       

        // Get a set of all key-value pairs
        Set<Map.Entry<String, Integer>> entries = treeMap.entrySet();
        System.out.println("All key-value pairs: " + entries);
    }
}
