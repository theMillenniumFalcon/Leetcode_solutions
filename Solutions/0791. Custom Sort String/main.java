public class main {
    public static void main(String[] args) {

    }

    // TC: O(length of str + length of order)
    // SC: O(1)
    public String customSortString(String order, String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (char orderChar : order.toCharArray()) {

            while (freq[orderChar - 'a'] > 0) {
                sb.append(orderChar);
                freq[orderChar - 'a']--;
            }
        }

        for (int i = 0; i < 26; i++) {
            int freqC = freq[i];

            while (freqC > 0) {
                sb.append((char) (i + 'a'));
                freqC--;
            }
        }

        return sb.toString();
    }
}