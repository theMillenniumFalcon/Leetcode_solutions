public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(n)
    // SC: O(n)
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                str.append(s.charAt(i));
            }
        }
            
        str = new StringBuilder(str.toString().replace(" ", "").toLowerCase());
        String value = str.toString();

        return value.equals(str.reverse().toString());
    }
}