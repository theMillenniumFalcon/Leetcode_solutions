public class main {
    public static void main(String[] args) {

    }

    public boolean isGoodArray(int[] nums) {
        int ans = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            ans = gcd(ans, nums[i]);
        }

        return ans == 1;
    }

    public int gcd(int x, int y) {
        int ans = 0;

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        ans = x;

        return ans;
    }
}