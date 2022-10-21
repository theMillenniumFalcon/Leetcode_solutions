import java.util.Map;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n), n -> length of nums
    // SC: O(n), n -> length of nums
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) {
            return false;
        }

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int integer = nums[i];
            if (hashMap.containsKey(integer) && i - hashMap.get(integer) <= k) {
                return true;
            }
            hashMap.put(integer, i);
        }

        return false;
    }
}