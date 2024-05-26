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
    }
}
