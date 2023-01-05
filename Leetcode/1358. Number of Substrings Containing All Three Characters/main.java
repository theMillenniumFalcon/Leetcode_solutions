public class main {
    public static void main(String[] args) {

    }

    // TC: O(n), n -> length of string s
    // SC: O(1)
    public int numberOfSubstrings(String s) {
        int[] count = { 0, 0, 0 };
        int res = 0, i = 0, n = s.length();
        for (int j = 0; j < n; ++j) {
            ++count[s.charAt(j) - 'a'];
            while (count[0] > 0 && count[1] > 0 && count[2] > 0)
                --count[s.charAt(i++) - 'a'];
            res += i;
        }

        return res;
    }
}