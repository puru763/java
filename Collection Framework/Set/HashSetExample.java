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

        // Add an element
        hashSet.add("Date");
        System.out.println("After adding Date: " + hashSet);

        // Get the size of the set
        System.out.println("Size of the set: " + hashSet.size());

        // Clear the set
        hashSet.clear();
        System.out.println("After clearing the set: " + hashSet);

        // Check if the set is empty
        System.out.println("Is the set empty? " + hashSet.isEmpty());
    }
}
