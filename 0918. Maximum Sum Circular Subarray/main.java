public class main {
    public static void main(String[] args) {

    }

    public int maxSubarraySumCircular(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int cMax = nums[0];
        int cMin = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            cMax = nums[i] + Math.max(cMax, 0);
            max = Math.max(max, cMax);

            cMin = nums[i] + Math.min(cMin, 0);
            min = Math.min(min, cMin);

            sum += nums[i];
        }

        return sum == min ? max : Math.max(max, sum - min);
    }
}