import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[102];

        for (int num : nums) {
            count[num]++;
        }

        int totalCount = 0;

        for (int i  :count) {
            totalCount += ((i) * (i - 1)) / 2;
        }

        return totalCount;
    }

    public int numIdenticalPairs2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int num : nums) {
            if (map.containsKey(num)) {
                ans += map.get(num);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return ans;
    }
}