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
    }
}
