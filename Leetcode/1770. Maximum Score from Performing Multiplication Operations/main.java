public class main {
    public static void main(String[] args) {

    }

    // TC: O(m * m), m -> length of multipliers
    // SC: O(n * n), n -> length of nums
    public int maximumScore(int[] nums, int[] multipliers) {
        return helper(multipliers, 0, nums, 0, new Integer[multipliers.length][multipliers.length]);
    }

    public int helper(int[] multipliers, int index, int[] nums, int start, Integer[][] dp) {
        if (index == multipliers.length) {
            return 0;
        }

        if (dp[index][start] != null) {
            return dp[index][start];
        }

        int end = nums.length - (index - start) - 1;

        int option1 = multipliers[index] * nums[start] + helper(multipliers, index + 1, nums, start + 1, dp);
        int option2 = multipliers[index] * nums[end] + helper(multipliers, index + 1, nums, start, dp);

        return dp[index][start] = Math.max(option1, option2);
    }
}
