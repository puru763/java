import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("ArrayList:");
        System.out.println("Initial List: " + arrayList);

        arrayList.add("Date");
        System.out.println("After adding Date: " + arrayList);

        arrayList.remove("Banana");
        System.out.println("After removing Banana: " + arrayList);

        System.out.println("Element at index 1: " + arrayList.get(1));

        // Additional operations for ArrayList
        // Get the size of the list
        System.out.println("Size of the list: " + arrayList.size());

        // Check if the list is empty
        System.out.println("Is the list empty? " + arrayList.isEmpty());

        // Remove an element by index
        arrayList.remove(0);
        System.out.println("After removing element at index 0: " + arrayList);

        // Set an element at a specific index
        arrayList.set(1, "Elderberry");
        System.out.println("After setting element at index 1: " + arrayList);

        // Check if the list contains an element
        System.out.println("Contains 'Cherry'? " + arrayList.contains("Cherry"));

        // Clear the list
        arrayList.clear();
        System.out.println("After clearing the list: " + arrayList);
    }
}
