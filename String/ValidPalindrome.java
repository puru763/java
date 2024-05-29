import java.util.Scanner;

class   ValidPalindromeSolution{
        public boolean isPalindrome(String s) {
            s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            int i = 0;
            int j = s.length()-1;
            while(i<j){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }



        // public boolean isPalindrome(String s) {
        //     StringBuilder sb = new StringBuilder();
            
        //     for (int i = 0; i < s.length(); i++) {
        //         char c = s.charAt(i);
        //         if (Character.isLetterOrDigit(c)) {
        //             sb.append(Character.toLowerCase(c));
        //         }
        //     }
            
        //     String cleaned = sb.toString();
        //     String reversed = new StringBuilder(cleaned).reverse().toString();
            
        //     return cleaned.equals(reversed);
        // }

}

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ValidPalindromeSolution solution  = new ValidPalindromeSolution();
            solution.isPalindrome(s);
            System.out.println(solution.isPalindrome(s));
    
            }
    
}
