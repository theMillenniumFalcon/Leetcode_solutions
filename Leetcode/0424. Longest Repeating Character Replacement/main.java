public class main {
    public static void main(String[] args) {

    }

    // TC : O(n)
    // SC: O(1)
    public int characterReplacement(String s, int k) {
        char[] arr = s.toCharArray();
        int left = 0, right = 0, maxCount = 0, arrLen = arr.length;

        int[] alpha = new int[26];

        while (right < arrLen) {
            alpha[arr[right] - 'A']++;
            maxCount = Math.max(maxCount, alpha[arr[right] - 'A']);
            while (right - left + 1 - maxCount > k)
                alpha[arr[left++] - 'A']--;
            right++;
        }

        return s.length() - left;
    }
}