package singleton; 

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void someMethod() {
        System.out.println("This is a method in the Singleton instance.");
    }
}



