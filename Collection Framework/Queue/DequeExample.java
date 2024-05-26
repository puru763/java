import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        // Deque
        Deque<String> deque = new LinkedList<>();
        deque.add("Elephant");
        deque.add("Fox");
        deque.add("Giraffe");

        System.out.println("\nDeque:");
        System.out.println("Initial Queue: " + deque);

        // Additional operations for Deque
        // Add element at the beginning
        deque.addFirst("Dog");
        System.out.println("After adding Dog at the beginning: " + deque);

        // Remove the last element
        System.out.println("Remove Last: " + deque.removeLast());

        // Add element at the end
        deque.addLast("Hippo");
        System.out.println("After adding Hippo at the end: " + deque);

        // Remove the first element
        System.out.println("Remove First: " + deque.removeFirst());

        // Peek at the first element
        System.out.println("Peek First: " + deque.peekFirst());

        // Peek at the last element
        System.out.println("Peek Last: " + deque.peekLast());

        // Check if the Deque is empty
        System.out.println("Is Deque empty? " + deque.isEmpty());

        // Get the size of the Deque
        System.out.println("Size of Deque: " + deque.size());

        // Clear the Deque
        deque.clear();
        System.out.println("After clearing the Deque: " + deque);
    }
}
