import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n)
    // SC: O(1)
    int[][] dir = new int[][] { { 0, 1 }, { 0, -1 }, { -1, 0 }, { 1, 0 } };

    public int shortestPath(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        if (m == 0 || n == 0) {
            return 0;
        }

        int[][] obstacle = new int[m][n];

        boolean[][] visited = new boolean[m][n];

        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] { 0, 0, grid[0][0] });
        obstacle[0][0] = grid[0][0];

        int level = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] head = queue.poll();
                if (head[0] == m - 1 && head[1] == n - 1) {
                    return level - 1;
                }
                int currObstacleCount = head[2];
                for (int[] d : dir) {
                    int x = head[0] + d[0];
                    int y = head[1] + d[1];

                    if (!(x >= 0 && y >= 0 && x < m && y < n)) {
                        continue;
                    }

                    int oldObstacleCount = obstacle[x][y];
                    int newObstacleCount = currObstacleCount + grid[x][y];

                    if ((!visited[x][y]) && newObstacleCount <= k) {
                        queue.add(new int[] { x, y, newObstacleCount });
                        obstacle[x][y] = newObstacleCount;
                        visited[x][y] = true;
                    }

                    if ((oldObstacleCount > newObstacleCount) && newObstacleCount <= k) {
                        queue.add(new int[] { x, y, newObstacleCount });
                        obstacle[x][y] = newObstacleCount;
                        visited[x][y] = true;
                    }
                }
            }
            level++;
        }

        return -1;
    }
}