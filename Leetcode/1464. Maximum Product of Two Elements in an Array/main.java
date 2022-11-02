import java.util.*;

public class main {
    public static void main(String[] args) {

    }

    public int maxProduct(int[] nums) {
        if(nums.length == 2 ){
            return (nums[0] - 1) * (nums[1] - 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : nums) {
            queue.add(i);
        }

        return (queue.poll() - 1) * (queue.poll() - 1);
    }
}