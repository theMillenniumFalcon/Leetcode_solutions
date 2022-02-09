import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        
    }

    static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                result[0] = i;
                result[1] = map.get(compliment);
                return result; 
            }
            map.put(nums[i], i);
        }
        return result;
    }
}