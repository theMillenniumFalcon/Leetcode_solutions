public class main {
    public static void main(String[] args) {
        
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int rowLength = matrix[0].length - 1;

        for (int i = 0; i < matrix.length; i++) {
            if (target > matrix[i][rowLength]) continue;

            int start = 0;
            int end = rowLength;
            while(start <= end) {
                int mid = start + (end - start) / 2;
                if (matrix[i][mid] == target) return true;

                if (matrix[i][mid] > target) end = mid - 1;
                else if (matrix[i][mid] < target) start = mid + 1;
            }
        }
        return false;
    }
}
