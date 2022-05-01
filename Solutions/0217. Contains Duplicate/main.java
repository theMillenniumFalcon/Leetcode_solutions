import java.util.*;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(n)
    // SC: O(n)
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }

        return false;
    }
}