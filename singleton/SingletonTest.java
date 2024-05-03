package singleton; // Ensure this matches the directory structure

public class SingletonTest {
    public static void main(String[] args) {
        // Get the Singleton instance
        Singleton singleton = Singleton.getInstance();

        // Call a method on the Singleton instance
        singleton.someMethod(); // Outputs: This is a method in the Singleton instance.
    }
}
