import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }
    
    // TC : O(n)
    // SC: O(n)
    public class MedianFinder {
        PriorityQueue<Integer> maxHeap;
        PriorityQueue<Integer> minHeap;
    
        public MedianFinder() {
            maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            minHeap = new PriorityQueue<>();
        }
    
        public void addNum(int num) {
            minHeap.add(num);
            maxHeap.add(minHeap.poll());
    
            if (maxHeap.size() > minHeap.size()) {
                minHeap.add(maxHeap.poll());
            }
        }
    
        public double findMedian() {
            if (minHeap.size() > maxHeap.size()) {
                return (double) minHeap.peek();
            } else {
                return (double) minHeap.peek() / 2d + (double) maxHeap.peek() / 2d;
            }
        }
    }
}

