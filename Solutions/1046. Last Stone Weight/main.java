import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            queue.add(stone);
        }
        while (queue.size() > 1) {
            int stone1 = queue.poll();
            int stone2 = queue.poll();
            if (stone1 > stone2) {
                queue.add(stone1 - stone2);
            }
        }

        return queue.isEmpty() ? 0 : queue.peek();
    }
}