import java.util.Arrays;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n * log(n)), n -> length of nums
    // SC: O(1)
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i > 1; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2])
                return nums[i] + nums[i - 1] + nums[i - 2];
        }

        return 0;
    }
}