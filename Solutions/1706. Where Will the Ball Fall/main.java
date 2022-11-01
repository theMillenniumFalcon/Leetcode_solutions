public class main {
    public static void main(String[] args) {

    }

    // TC: O(m * n), m -> length of grid, n -> length of row of grid
    // SC: O(1)
    public int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] res = new int[n];

        for (int j = 0; j < n; j++) {
            int currentPosition = j;
            int nextPosition = -1;
            for (int i = 0; i < m; i++) {
                nextPosition = currentPosition + grid[i][currentPosition];

                if (nextPosition < 0 || nextPosition >= n || grid[i][currentPosition] != grid[i][nextPosition]) {
                    currentPosition = -1;
                    break;
                }

                currentPosition = nextPosition;
            }

            res[j] = currentPosition;
        }

        return res;
    }
}