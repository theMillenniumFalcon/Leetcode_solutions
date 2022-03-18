public class main {
    public static void main(String[] args) {

    }

    public boolean validPalindrome(String s) {
        int a_pointer = 0;
        int b_pointer = s.length() - 1;

        while (a_pointer < b_pointer) {
            // if char are not equal then check for two possibilitites
            if (s.charAt(a_pointer) != s.charAt(b_pointer)) {
                return helper(s, a_pointer + 1, b_pointer) || helper(s, a_pointer, b_pointer - 1);
            }
            a_pointer++;
            b_pointer--;
        }

        return true;
    }

    public boolean helper(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }

        return true;
    }
}