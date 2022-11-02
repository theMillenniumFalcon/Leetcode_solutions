import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
                ans[i] = count;
            }
        }

        return ans;
    }

    public int[] smallerNumbersThanCurrent2(int[] nums) {
        int[] ans =  Arrays.stream(nums).sorted().toArray();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < ans.length; i++) {
            map.put(ans[i], map.getOrDefault(ans[i], i));
        }

        for (int i = 0; i < nums.length ;i ++) {
            ans[i] = map.get(nums[i]);
        }

        return ans;
    }
}