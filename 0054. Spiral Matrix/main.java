public class main {
    public static void main(String[] args) {
        
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList();

        if (matrix.length == 0) return result;

        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int columnStart = 0;
        int columnEnd = matrix[0].length-1;

        while(rowStart <= rowEnd && columnStart <= columnEnd) {
            for(int i=columnStart; i<=columnEnd; i++) {
                result.add(matrix[rowStart][i]);
            }
            rowStart++;

            for(int i=rowStart; i<=rowEnd; i++) {
                result.add(matrix[i][columnEnd]);
            }
            columnEnd--;

            if(rowStart <= rowEnd) {
                for(int i=columnEnd; i>=columnStart; i--) {
                    result.add(matrix[rowEnd][i]);
                }
            } 
            rowEnd--;

            if(columnStart <= columnEnd) {
                for(int i=rowEnd; i>=rowStart; i--) {
                    result.add(matrix[i][columnStart]);
                }
            }
            columnStart++;
        }
        return result;


    }
    
}
