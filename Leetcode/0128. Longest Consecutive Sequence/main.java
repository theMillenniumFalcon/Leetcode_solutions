import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(n)
    // SC: O(n)
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, true);
        }

        int longest = 0;

        for (int n : nums) {
            if (!map.get(n)) {
                continue;
            }
            map.put(n, false);

            int current = 1;
            int left = n - 1;
            int right = n + 1;

            while(map.containsKey(left)) {
                map.put(left, false);
                left--;
                current++;
            }

            while(map.containsKey(right)) {
                map.put(right, false);
                right++;
                current++;
            }

            if (current > longest){
                longest = current;
            }
        }

        return longest;
    }
}