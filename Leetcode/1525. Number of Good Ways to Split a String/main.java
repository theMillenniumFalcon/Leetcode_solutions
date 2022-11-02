public class main {
    public static void main(String[] args) {

    }

    // TC: O(n), n -> length of string
    // SC: O(n), n -> length of string
    public int numSplits(String s) {
        int n = s.length();

        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];

        int[] frequency = new int[26];

        int count = 0;
        for (int i = 0; i < n; i++) {
            int ch = s.charAt(i) - 'a';
            frequency[ch]++;

            if (frequency[ch] == 1) {
                count++;
            }

            prefixSum[i] = count;
        }

        frequency = new int[26];
        count = 0;

        for (int i = n - 1; i >= 0; i--) {
            int ch = s.charAt(i) - 'a';

            frequency[ch]++;

            if (frequency[ch] == 1) {
                count++;
            }

            suffixSum[i] = count;
        }

        int splits = 0;

        for (int i = 0; i < n - 1; i++) {
            if (prefixSum[i] == suffixSum[i + 1]) {
                splits++;
            }
        }

        return splits;
    }
}