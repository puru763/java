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

        // Peek at the last element
        System.out.println("Peek Last: " + arrayDeque.peekLast());

        // Remove the last element
        System.out.println("Remove Last: " + arrayDeque.pollLast());

        // Check if the ArrayDeque is empty
        System.out.println("Is ArrayDeque empty? " + arrayDeque.isEmpty());

        // Get the size of the ArrayDeque
        System.out.println("Size of ArrayDeque: " + arrayDeque.size());

        // Clear the ArrayDeque
        arrayDeque.clear();
        System.out.println("After clearing the ArrayDeque: " + arrayDeque);
    }
}
