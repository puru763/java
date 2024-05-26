import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // ArrayDeque
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("House");
        arrayDeque.add("Igloo");
        arrayDeque.add("Jungle");

        System.out.println("\nArrayDeque:");
        System.out.println("Initial Queue: " + arrayDeque);

        // Additional operations for ArrayDeque
        // Peek at the first element
        System.out.println("Peek First: " + arrayDeque.peekFirst());

        // Remove the first element
        System.out.println("Remove First: " + arrayDeque.pollFirst());
    }
}
