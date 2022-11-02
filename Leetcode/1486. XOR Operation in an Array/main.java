public class main {
    public static void main(String[] args) {

    }

    // TC: O(n)
    // SC: O(1)
    public int xorOperation(int n, int start) {
        int res = 0;

        for (int i = 0; i < n; i++) {
            res ^= start + 2 * i;
        }

        return res;
    }
}