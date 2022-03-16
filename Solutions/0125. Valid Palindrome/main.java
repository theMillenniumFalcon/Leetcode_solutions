public class main {
    public static void main(String[] args) {
        
    }

    public boolean isPalindrome(String s) {
        String fixedString = "";

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                fixedString += c;
            }
        }

        fixedString = fixedString.toLowerCase();

        int a_pointer = 0;
        int b_pointer = fixedString.length() - 1;

        while (a_pointer <= b_pointer) {
            if (fixedString.charAt(a_pointer) != fixedString.charAt(b_pointer)) {
                return false;
            }

            a_pointer++;
            b_pointer--;
        }

        return true;
    }
}