import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(n)
    // SC: O(n)
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List freq = new ArrayList<>(nums.length + 1);

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            freq[map]
        }
    }
}