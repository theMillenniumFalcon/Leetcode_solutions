import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n), n -> length of graph matrix
    // SC: O(n), n -> length of graph matrix
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();

        int startIndex = 0;
        int endIndex = graph.length - 1;

        Queue<List<Integer>> queue = new LinkedList<>();

        queue.add(Arrays.asList(startIndex));

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size-- > 0) {
                List<Integer> headList = queue.poll();

                if (headList.get(headList.size() - 1) == endIndex) {
                    res.add(headList);
                }

                int lastNode = headList.get(headList.size() - 1);

                for (int connection : graph[lastNode]) {
                    List<Integer> copyList = new ArrayList<>(headList);
                    copyList.add(connection);
                    queue.add(copyList);
                }
            }
        }

        return res;
    }
}