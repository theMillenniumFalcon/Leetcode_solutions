import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(nlog k)
    // SC: O(k)
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> (a[1] - b[1]));

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            minHeap.offer(new int[]{entry.getKey(), entry.getValue()});
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int[] res = new int[k];

        while (k > 0) {
            res[k - 1] = minHeap.poll()[0];
            k--;
        }

        return res;
    }
}