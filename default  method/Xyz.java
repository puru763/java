public class Xyz implements Abc {
    public void showNormal() {
        System.out.println("This is a normal method");
    }

    public static void main(String[] args) {
        Xyz d = new Xyz();
        d.showDefault(); 
        d.showNormal(); 
    }
}