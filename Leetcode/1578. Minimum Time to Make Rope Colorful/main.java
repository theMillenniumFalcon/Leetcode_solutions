public class main {
    public static void main(String[] args) {

    }

    // TC: O(n), n -> length of colors
    // SC: O(1)
    public int minCost(String colors, int[] neededTime) {
        int i = 0, j = 1, n = colors.length(), res = 0;
        if (n == 1)
            return 0;

        while (j < n) {
            while (neededTime[i] == -1)
                ++i;

            if (colors.charAt(i) != colors.charAt(j)) {
                ++i;
                ++j;
            } else {
                if (neededTime[i] < neededTime[j]) {
                    res += neededTime[i];
                    ++i;
                    ++j;
                } else {
                    res += neededTime[j];
                    neededTime[j] = -1;
                    ++j;
                }
            }
        }

        return res;
    }
}