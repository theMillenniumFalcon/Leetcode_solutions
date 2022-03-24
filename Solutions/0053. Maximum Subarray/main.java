public class main {
    public static void main(String[] args) {
        
    }

    public int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int current_max_sum = max_sum;

        for (int i = 1; i < nums.length; i++) {
            current_max_sum = Math.max(nums[i] + current_max_sum, nums[i]);
            max_sum = Math.max(current_max_sum, max_sum);
        }

        return max_sum;
    }
}