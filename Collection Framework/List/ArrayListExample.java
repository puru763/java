import java.util.ArrayList;

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
    }
}
