import java.util.Vector;

class Digital {

    public static void main(String[] args) {
        String s = "abc123abc123ab12a1";

        Vector<String> words = new Vector<>();
        Vector<String> numbers = new Vector<>();
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) && (i == s.length() - 1 || Character.isLetter(s.charAt(i + 1)))) {
                ans += s.charAt(i);
            } else {
                words.add(ans);
                ans = "";
            }

            if (Character.isDigit(s.charAt(i)) && (i == s.length() - 1 || Character.isDigit(s.charAt(i + 1)))) {
                ans += s.charAt(i);
            } else {
                numbers.add(ans);
                ans = "";
            }
        }

        System.out.println("Words: " + words);
        System.out.println("Numbers: " + numbers);
    }
}
