import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(n^2)
    // SC: O(n^2)
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        if (heights == null || heights.length == 0 || heights[0].length == 0) {
            return res;
        }

        int m = heights.length;
        int n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        for (int j = 0; j < n; j++) {
            dfs(0, j, pacific, heights, Integer.MIN_VALUE);
            dfs(m - 1, j, atlantic, heights, Integer.MIN_VALUE);
        }

        for (int i = 0; i < m; i++) {
            dfs(i, 0, pacific, heights, Integer.MIN_VALUE);
            dfs(i, n - 1, atlantic, heights, Integer.MIN_VALUE);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    List<Integer> indexes = new ArrayList<>();
                    indexes.add(i);
                    indexes.add(j);
                    res.add(indexes);
                }
            }
        }
        return res;
    }

    public void dfs(int start, int end, boolean[][] conditionMatrix, int[][] heights, int prevHeight) {
        if (start < 0 || end < 0 || start >= heights.length || end >= heights[0].length
                || conditionMatrix[start][end] || heights[start][end] < prevHeight) {
            return;
        }

        conditionMatrix[start][end] = true;

        dfs(start + 1, end, conditionMatrix, heights, heights[start][end]);
        dfs(start - 1, end, conditionMatrix, heights, heights[start][end]);
        dfs(start, end - 1, conditionMatrix, heights, heights[start][end]);
        dfs(start, end + 1, conditionMatrix, heights, heights[start][end]);
    }
}