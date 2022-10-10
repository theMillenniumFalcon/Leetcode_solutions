public class main {
    public static void main(String[] args) {

    }

    // TC: O(n), length of palindrome string
    // SC: O(1)
    public String breakPalindrome(String palindrome) {
        char[] str = palindrome.toCharArray();

        if (str.length < 2) {
            return "";
        }

        for (int i = 0; i < str.length / 2; i++) {
            if (str[i] != 'a') {
                str[i] = 'a';

                return String.valueOf(str);
            }
        }

        str[str.length - 1] = 'b';

        return String.valueOf(str);
    }
}