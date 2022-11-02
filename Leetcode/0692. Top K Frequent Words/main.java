import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n), n -> length of words
    // SC: O(n)
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : words) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        Queue<String> queue = new PriorityQueue<>(
                (w1, w2) -> map.get(w1).equals(map.get(w2)) ? w2.compareTo(w1) : map.get(w1) - map.get(w2));

        for (String word : map.keySet()) {
            queue.add(word);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        List<String> res = new ArrayList<>();

        while (!queue.isEmpty()) {
            res.add(queue.poll());
        }
        Collections.reverse(res);

        return res;
    }
}