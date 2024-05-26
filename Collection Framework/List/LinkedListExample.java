import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Elephant");
        linkedList.add("Fox");
        linkedList.add("Giraffe");

        System.out.println("\nLinkedList:");
        System.out.println("Initial List: " + linkedList);

        linkedList.addFirst("Dog");
        System.out.println("After adding Dog at the beginning: " + linkedList);

        linkedList.addLast("Cat");
        System.out.println("After adding Cat at the end: " + linkedList);

        linkedList.removeLast();
        System.out.println("After removing the last element: " + linkedList);

        linkedList.removeFirst();
        System.out.println("After removing the first element: " + linkedList);

        System.out.println("First element: " + linkedList.getFirst());

      
        System.out.println("Contains 'Fox'? " + linkedList.contains("Fox"));

        System.out.println("Size of the list: " + linkedList.size());

        // Clear the list
        linkedList.clear();
        System.out.println("After clearing the list: " + linkedList);
    }
}
