import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(n)
    // SC: O(n)
    public boolean isPossibleDivide(int[] nums, int k) {
        if (nums.length % k != 0) return false;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int card : nums) {
            if (!map.containsKey(card)) {
                map.put(card, 1);
            } else {
                map.replace(card, map.get(card) + 1);
            }
        }

        while (map.size() > 0) {
            int min_val = map.firstKey();
            for (int card = min_val; card < min_val + k; card++) {
                if (!map.containsKey(card)) {
                    return false;
                }
                int count = map.get(card);
                if (count == 1) {
                    map.remove(card);
                } else {
                    map.replace(card, count - 1);
                }
            }
        }

        return true;
    }
}