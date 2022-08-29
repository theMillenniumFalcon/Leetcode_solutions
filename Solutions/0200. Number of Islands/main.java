public class main {
    public static void main(String[] args) {

    }

    // TC : O(n^2)
    // SC: O(n)
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length, res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    dfs(grid, i, j);
                }
            }
        }

        return res;
    }

    public void dfs(char[][] grid, int row, int col) {

        if (row < 0 || col < 0 || row >= grid.length
                || col >= grid[0].length || grid[row][col] == '0') {
            return;
        }

        grid[row][col] = '0'; // mark visited

        dfs(grid, row - 1, col);
        dfs(grid, row, col - 1);
        dfs(grid, row + 1, col);
        dfs(grid, row, col + 1);
    }
}