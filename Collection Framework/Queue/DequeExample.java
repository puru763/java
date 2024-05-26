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
    }
}
