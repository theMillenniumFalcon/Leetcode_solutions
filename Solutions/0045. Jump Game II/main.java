public class main {
    public static void main(String[] args) {

    }

    // TC : O(n)
    // SC: O(1)
    public int jump(int[] nums) {
        int steps = 0;
        int maxx = 0;
        int preMax = 0;
        while (maxx < nums.length - 1) {
            for (int cur = 0; cur <= preMax; cur++) {
                maxx = Math.max(maxx, nums[cur] + cur);
            }
            steps++;
            preMax = maxx;
        }
        return steps;
    }
}