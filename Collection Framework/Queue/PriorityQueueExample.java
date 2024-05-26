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
    }
}
