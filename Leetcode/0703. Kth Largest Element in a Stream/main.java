import java.util.*;

class KthLargest {

    int k;
    PriorityQueue<Integer> minHeap;

    // TC : O(n log n)
    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
        }
        while (minHeap.size() > k) {
            minHeap.poll();
        }
    }
    
    // TC : O(log n)
    public int add(int val) {
        minHeap.add(val);

        if (minHeap.size() > k) {
            minHeap.poll();
        }

        return minHeap.peek();
    }
}