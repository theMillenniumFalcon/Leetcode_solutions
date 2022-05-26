import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(n)
    // SC: O(k)
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int rightIndex = 0;
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0 ; i < n; i++) {
            // remove numbers out of range k
            if (!deque.isEmpty() && deque.peek() == (i - k)) {
                deque.poll();
            }
            // remove smaller numbers in k range as they are useless
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offer(i);
            if (i >= k - 1) {
                res[rightIndex++] = nums[deque.peek()];
            }
        }

        return res;
    }
}