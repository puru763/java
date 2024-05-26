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
    }
}
