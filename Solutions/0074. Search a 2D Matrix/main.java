public class main {
    public static void main(String[] args) {
        
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;

        int row = matrix.length;
        int col = matrix[0].length;

        int low = 0;
        int high = (row * col) - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[mid / col][mid % col] == target) {
                return true;
            }
            if (matrix[mid / col][mid % col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
