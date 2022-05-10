import java.util.*;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(n^2)
    // SC: O(n^2)
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {

                    // Check whether HashSet contains duplicate elements in row and column
                    if (set.contains("row" + i + board[i][j]) || set.contains("col" + j + board[i][j])) {
                        return false;
                    }
                    set.add("row" + i + board[i][j]);
                    set.add("col" + j + board[i][j]);

                    // Check whether Box contains duplicate elements in it
                    if (set.contains("box" + (i / 3) * 3 + j / 3 + board[i][j])) {
                        return false;
                    }
                    set.add("box" + (i / 3) * 3 + j / 3 + board[i][j]);
                }
            }
        }

        return true;
    }
}