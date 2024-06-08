public class Overloading {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        
        System.out.println("Sum of 5 and 10: " + obj.add(5, 10));
        System.out.println("Sum of 2.5 and 3.5: " + obj.add(2.5, 3.5));
    }
}
