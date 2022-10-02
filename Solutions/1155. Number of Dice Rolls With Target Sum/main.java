public class main {
    public static void main(String[] args) {

    }

    // TC: O(k)
    // SC: O(log(k) + n * k), log(k) -> auxiliary space
    int MOD = 1000000007;

    public int numRollsToTarget(int n, int k, int target) {
        Integer[][] dp = new Integer[n + 1][target + 1];

        return helper(n, k, target, dp);
    }

    public int helper(int dice, int faces, int target, Integer[][] dp) {
        if (target < 0)
            return 0;
        if (dice == 0 && target != 0)
            return 0;
        if (dice != 0 && target == 0)
            return 0;
        if (dice == 0 && target == 0)
            return 1;

        if (dp[dice][target] != null) {
            return dp[dice][target];
        }

        int ans = 0;
        for (int i = 1; i <= faces; i++) {
            ans = (ans + (helper(dice - 1, faces, target - i, dp)) % MOD) % MOD;
        }

        return dp[dice][target] = ans;
    }
}