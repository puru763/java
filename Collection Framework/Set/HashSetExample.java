import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        System.out.println("HashSet:");
        System.out.println("Initial Set: " + hashSet);

        // Additional operations for HashSet
        // Check if an element exists
        System.out.println("Contains 'Banana': " + hashSet.contains("Banana"));

        // Remove an element
        hashSet.remove("Banana");
        System.out.println("After removing 'Banana': " + hashSet);
    }
}
