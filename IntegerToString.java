public class IntegerToString {
    public static void main(String[] args) {

        // String to Integer
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println("String to Integer: " + num);

        // Integer to String
        int num2 = 456;
        String str2 = String.valueOf(num2);
        System.out.println("Integer to String: " + str2);


        // Integer to String
        int n = 123;
        String s = Integer.toString(n);
        System.out.println("checking type " + s.getClass());


    }
}
Strems