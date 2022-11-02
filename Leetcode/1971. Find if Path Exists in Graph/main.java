import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(n)
    // SC: O(n)
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (edges.length == 0) {
            return true;
        }

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> visited = new LinkedList<>();
        queue.add(source);

        while (!queue.isEmpty()) {
            int t = queue.poll();

            for (int i = 0; i < edges.length; i++) {
                if (edges[i][0] == t && !visited.contains(edges[i][1])) {
                    queue.add(edges[i][1]);
                    visited.add(edges[i][1]);
                }

                if (edges[i][1] == t && !visited.contains(edges[i][0])) {
					queue.add(edges[i][0]);
                    visited.add(edges[i][0]);
				}
            }
            if (queue.contains(destination))
				return true;
        }

        return false;
    }
}