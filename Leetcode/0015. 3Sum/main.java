import java.util.*;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(n^2)
    // SC: O(1)
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new LinkedList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int lowPointer = i + 1, highPointer = nums.length - 1, sum = 0 - nums[i];

                while (lowPointer < highPointer) {
                    if (nums[lowPointer] + nums[highPointer] == sum) {
                        res.add(Arrays.asList(nums[i], nums[lowPointer], nums[highPointer]));

                        while (lowPointer < highPointer && nums[lowPointer] == nums[lowPointer + 1]) {
                            lowPointer++;
                        }
                        while (lowPointer < highPointer && nums[highPointer] == nums[highPointer - 1]) {
                            highPointer--;
                        }
                        lowPointer++;
                        highPointer--;
                    } else if (nums[lowPointer] + nums[highPointer] < sum) {
                        lowPointer++;
                    } else {
                        highPointer--;
                    }
                }
            }
        }

        return res;
    }
}