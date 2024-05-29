import java.util.Scanner;

class ReverseStringSolution {
    public String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}

class ReverseString {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = sc.nextLine();

        

        ReverseStringSolution solution = new ReverseStringSolution();
        String output = solution.reverseString(input);

        System.out.println("Reversed string: " + output);
    }
}