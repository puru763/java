import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("House");
        vector.add("Igloo");
        vector.add("Jungle");

        System.out.println("\nVector:");
        System.out.println("Initial List: " + vector);

        vector.add("Kite");
        System.out.println("After adding Kite: " + vector);

        vector.removeElement("Igloo");
        System.out.println("After removing Igloo: " + vector);

        System.out.println("Element at index 2: " + vector.get(2));

        // Additional operations for Vector
        // Check if the vector contains an element
        System.out.println("Contains 'Jungle'? " + vector.contains("Jungle"));

        // Get the size of the vector
        System.out.println("Size of the vector: " + vector.size());

        // Get the capacity of the vector
        System.out.println("Capacity of the vector: " + vector.capacity());

        // Clear the vector
        vector.clear();
        System.out.println("After clearing the vector: " + vector);

        // Check if the vector is empty
        System.out.println("Is the vector empty? " + vector.isEmpty());
    }
}
