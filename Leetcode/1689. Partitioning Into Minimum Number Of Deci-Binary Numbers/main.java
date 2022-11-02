public class main {
    public static void main(String[] args) {

    }

    // TC : O(n), n -> length of input string
    // SC: O(1)
    public int minPartitions(String n) {
        int ans = 0;

        for (char ch : n.toCharArray()) {
            ans = Math.max(ans, ch - '0');
        }
        return ans;
    }
}