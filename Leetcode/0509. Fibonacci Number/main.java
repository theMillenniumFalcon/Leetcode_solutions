import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(n)
    // SC: O(2^n)
    public int fib(int n) {
        if (n <= 1) return n;
        
        return fib(n - 1) + fib(n - 2);
    }

    // TC : O(n)
    // SC: O(n) + O(n)
    public int fib2(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return fib2helper(n, dp);
    }

    public int fib2helper(int n, int[] dp) {
        if (n <= 1) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = fib2helper(n - 1, dp) + fib2helper(n - 2, dp);
    }

    // Tabulation
    // TC : O(n)
    // SC: O(n) // no recursive stack space
    public int fib3(int n) {
        if (n <= 1) return n;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    // TC : O(n)
    // SC: O(1)
    public int fib4(int n) {
        if (n <= 1) return n;
        int prev2 = 0;
        int prev1 = 1;
        for(int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}