import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Elephant");
        linkedHashSet.add("Fox");
        linkedHashSet.add("Giraffe");

        System.out.println("\nLinkedHashSet:");
        System.out.println("Initial Set: " + linkedHashSet);

        // Additional operations for LinkedHashSet
        // Check the size of the set
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        // Clear the set
        linkedHashSet.clear();
        System.out.println("After clearing the set: " + linkedHashSet);
    }
}
