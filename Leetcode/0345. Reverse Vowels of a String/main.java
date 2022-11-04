public class main {
    public static void main(String[] args) {
        
    }

    // TC: O(n), n -> length of string
    // SC: O(n), n -> length of string
    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !isVowel(charArray[left])) {
                left++;
            }
            while (left < right && !isVowel(charArray[right])) {
                right--;
            }
            if (left < right) {
                char temp = charArray[left];
                charArray[left++] = charArray[right];
                charArray[right--] = temp;
            }
        }

        return new String(charArray);
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
