import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\krish\\Desktop\\java\\input.txt");
            FileOutputStream fos = new FileOutputStream("output.txt");

            int c;
            while ((c = fis.read()) != -1) {
                fos.write((byte) c);
            }

            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
