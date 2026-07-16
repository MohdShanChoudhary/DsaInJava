public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        s = s.toUpperCase();

        int i = 0;
        int l = s.length() - 1;

        while (i < l) {

            if (s.charAt(i) != s.charAt(l)) {
                return false;
            }

            i++;
            l--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "My name is khan";

        if (isPalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}