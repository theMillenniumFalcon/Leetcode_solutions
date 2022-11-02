import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(n) + K*log(k), n -> length of the string, k -> number of distinct characters in the string
    // SC: O(n)
    public String frequencySort(String s) {
         HashMap<Character, Integer> map = new HashMap<>();

         for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
         }

         PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

         maxHeap.addAll(map.keySet());

         StringBuilder res = new StringBuilder();

         while (!maxHeap.isEmpty()) {
            char current = maxHeap.remove();

            for (int i = 0; i < map.get(current); i++) {
                res.append(current);
            }
         }

         return res.toString();
    }
}
