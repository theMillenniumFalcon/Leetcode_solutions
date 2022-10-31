public class main {
    public static void main(String[] args) {

    }

    // TC: O(m * n), n -> length of row of matrix, m -> length of column of matrix
    // SC: O(1)
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }

        return true;
    }
}