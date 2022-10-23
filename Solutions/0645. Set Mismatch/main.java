import java.util.HashSet;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n), n -> length of nums
    // SC: O(n), n -> length of nums
    public int[] findErrorNums(int[] nums) {
        int duplicate = 0;
        int miss = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; ++i) {
            if (set.contains(nums[i])) {
                duplicate = nums[i];
            }
            set.add(nums[i]);
        }

        for (int i = 1; i <= nums.length; ++i) {
            if (!set.contains(i)) {
                miss = i;
                break;
            }
        }

        return new int[] { duplicate, miss };
    }
}
