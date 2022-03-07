public class main {
    public static void main(String[] args) {
        
    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int result = 0;
        int n = grid.length;

        int[] max_rows_vals = new int[n];
        int[] max_cols_vals = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                max_rows_vals[i] = Math.max(max_rows_vals[i], grid[i][j]);
                max_cols_vals[j] = Math.max(max_cols_vals[j], grid[i][j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result += Math.min(max_rows_vals[i], max_cols_vals[j]) - grid[i][j];
            }
        }

        return result;
    }
}