import java.util.Map;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n), n -> length of nums
    // SC: O(n), n -> length of nums
    public boolean checkSubarraySum(int[] nums, int k) {
        // remainder, index
        Map<Integer, Integer> map = new HashMap<>();

        if (k == 0) {
            boolean Zeroes = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0 && nums[i - 1] == 0) {
                    Zeroes = true;
                }
            }
            return Zeroes;
        }

        map.put(0, -1);
        int prefixSum = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            if (map.containsKey(prefixSum % k)) {
                if ((i - (map.get(prefixSum % k))) > 1) {
                    return true;
                }
            }
            map.putIfAbsent(prefixSum % k, i);
        }

        return false;
    }
}