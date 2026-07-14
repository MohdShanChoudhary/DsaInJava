public class CountsVowels {

    public static void main(String[] args) {

        String s = "mohammad";
        char c;
        int v = 0, cc = 0;

        s = s.toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);

            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                v++;
            } else {
                cc++;
            }
        }

        System.out.println("The total number of vowels are: " + v);
        System.out.println("The total number of consonants are: " + cc);
    }
}