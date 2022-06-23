import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(n)
    // SC: O(1)
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(a);
        maxHeap.add(b);
        maxHeap.add(c);
        int res = 0;

        while (maxHeap.size() >= 2) {
            int left = maxHeap.poll();
            int right = maxHeap.poll();
            left--;
            right--;
            if (left != 0) {
                maxHeap.add(left);
            }
            if (right != 0) {
                maxHeap.add(right);
            }
            res++;
        }

        return res;
    }
}