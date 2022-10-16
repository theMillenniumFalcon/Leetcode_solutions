public class main {
    public static void main(String[] args) {

    }

    public int minDifficulty(int[] jobDifficulty, int d) {
        if (jobDifficulty.length < d) {
            return -1;
        }
        Integer[][] dp = new Integer[d + 1][jobDifficulty.length];

        return dfs(jobDifficulty, dp, d, 0);
    }

    public int dfs(int[] jobDifficulty, Integer[][] dp, int d, int index) {
        if (d == 1) {
            int max = 0;

            while (index < jobDifficulty.length) {
                max = Math.max(max, jobDifficulty[index]);
                index++;
            }
            return max;
        }

        if (dp[d][index] != null) {
            return dp[d][index];
        }

        int leftMax = 0;

        int res = Integer.MAX_VALUE;

        for (int i = index; i < jobDifficulty.length - d + 1; i++) {
            leftMax = Math.max(leftMax, jobDifficulty[i]);
            int rightMax = dfs(jobDifficulty, dp, d - 1, i + 1);
            res = Math.min(res, leftMax + rightMax);
        }

        return dp[d][index] = res;
    }
}