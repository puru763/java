class PalindromeSolution {
    // public boolean isPalindrome(Integer number) {
    //     String str = number.toString();
    //     int i = 0;
    //     int j = str.length() - 1;
    //     while (i < j) {
    //         if (str.charAt(i) != str.charAt(j)) {
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }


        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }
            int originalNumber = x;
            int reversedNumber = 0;
            
            while (x > 0) {
                int remainder = x % 10;
                reversedNumber = reversedNumber * 10 + remainder;
                x /= 10;
            }
            
            return originalNumber == reversedNumber;
        }      
}

public class Palindrome {
    public static void main(String[] args) {
        Integer number = 121;

        PalindromeSolution solution = new PalindromeSolution();
        System.out.println(solution.isPalindrome(number));
    }
}
