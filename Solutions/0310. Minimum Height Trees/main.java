import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n)
    // SC: O(n)
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        ArrayList<Integer> res = new ArrayList<>();

        if (n <= 0) {
            return res;
        }
        if (n == 1) {
            res.add(0);

            return res;
        }

        Map<Integer, Set<Integer>> map = new HashMap<>();

        int[] degree = new int[n];

        for (int[] edge : edges) {
            degree[edge[0]]++;
            degree[edge[1]]++;
            map.putIfAbsent(edge[0], new HashSet<>());
            map.get(edge[0]).add(edge[1]);
            map.putIfAbsent(edge[1], new HashSet<>());
            map.get(edge[1]).add(edge[0]);
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (degree[i] == 1) {
                queue.offer(i);
            }
        }

        int count = n;

        while (count > 2) {
            int size = queue.size();
            count = count - size;
            while (size-- > 0) {
                Integer leaf = queue.poll();
                for (Integer connection : map.get(leaf)) {
                    degree[connection]--;
                    map.get(connection).remove(leaf);
                    if (degree[connection] == 1) {
                        queue.offer(connection);
                    }
                }

            }
        }

        return new ArrayList<>(queue);
    }
}