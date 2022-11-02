import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return res;
        }

        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int compliment = target - nums[j] - nums[i];

                int front = j + 1;
                int back = n - 1;

                while (front < back) {
                    int two_sum  = nums[front] + nums[back];
                    if (two_sum < compliment) {
                        front++;
                    } else if (two_sum > compliment) {
                        back--;
                    } else {
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[front]);
                        quad.add(nums[back]);
                        res.add(quad);

                        while (front < back && nums[front] == quad.get(2)) {
                            ++front;
                        }
                        while (front < back && nums[back] == quad.get(3)) {
                            --back;
                        }
                    }
                }

                while (j + 1 < n && nums[j + 1] == nums[j]) {
                    ++j;
                }
            }

            while (i + 1 < n && nums[i + 1] == nums[i]) {
                ++i;
            }
        }

        return res;
    }
}