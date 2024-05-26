import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Apple");
        priorityQueue.add("Banana");
        priorityQueue.add("Cherry");

        System.out.println("PriorityQueue:");
        System.out.println("Initial Queue: " + priorityQueue);

        // Additional operations for PriorityQueue
        // Peek at the head of the queue
        System.out.println("Peek: " + priorityQueue.peek());

        // Remove the head of the queue
        System.out.println("Poll: " + priorityQueue.poll());

        // Check if an element exists
        System.out.println("Contains 'Banana': " + priorityQueue.contains("Banana"));

        // Add an element
        priorityQueue.add("Date");
        System.out.println("After adding Date: " + priorityQueue);

        // Remove an element
        priorityQueue.remove("Cherry");
        System.out.println("After removing Cherry: " + priorityQueue);

        // Get the size of the queue
        System.out.println("Size of the queue: " + priorityQueue.size());

        // Clear the queue
        priorityQueue.clear();
        System.out.println("After clearing the queue: " + priorityQueue);

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + priorityQueue.isEmpty());
    }
}
