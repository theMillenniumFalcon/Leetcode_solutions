import java.util.*;

public class main {
    public static void main(String[] args) {

    }

    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current_val = board[i][j];
                if (current_val != '.') {
                    if (!set.add(current_val + " found in row " + i) ||
                    !set.add(current_val + " found in column " + j) ||
                    !set.add(current_val + " found in sub-boxes " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}