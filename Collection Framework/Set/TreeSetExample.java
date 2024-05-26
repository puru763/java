import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // TreeSet
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("House");
        treeSet.add("Igloo");
        treeSet.add("Jungle");

        System.out.println("\nTreeSet:");
        System.out.println("Initial Set: " + treeSet);

        // Additional operations for TreeSet
        // Get the first element
        System.out.println("First element: " + treeSet.first());

        // Get the last element
        System.out.println("Last element: " + treeSet.last());

        // Add an element
        treeSet.add("Kite");
        System.out.println("After adding Kite: " + treeSet);

        // Remove an element
        treeSet.remove("Igloo");
        System.out.println("After removing Igloo: " + treeSet);

        // Check if the set contains an element
        System.out.println("Contains 'House'? " + treeSet.contains("House"));

        // Get the size of the set
        System.out.println("Size of the set: " + treeSet.size());

        // Clear the set
        treeSet.clear();
        System.out.println("After clearing the set: " + treeSet);

        // Check if the set is empty
        System.out.println("Is the set empty? " + treeSet.isEmpty());
    }
}
