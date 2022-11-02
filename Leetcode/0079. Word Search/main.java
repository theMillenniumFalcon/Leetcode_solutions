import java.util.prefs.BackingStoreException;

public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(n * m), n -> number of rows, m -> number of columns
    // SC: O(n * m), n -> number of rows, m -> number of columns
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(char[][] board, int row, int col, int count, String word) {
        if (count == word.length()) return true;
        if (row < 0 || row >= board.length || col < 0 || col >= board[row].length || board[row][col] != word.charAt(count)) return false;

        char temp = board[row][col];
        board[row][col] = ' ';
        boolean found = dfs(board, row + 1, col, count + 1, word) || dfs(board, row - 1, col, count + 1, word) || 
            dfs(board, row, col + 1, count + 1, word) || dfs(board, row, col - 1, count + 1, word);
        
        board[row][col] = temp;

        return found;
    }
}