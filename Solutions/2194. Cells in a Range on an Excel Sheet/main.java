import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(n*m), n -> number of rows, m -> number of columns
    // SC: O(1)
    public List<String> cellsInRange(String s) {
        char startColumn = s.charAt(0);
        int startRow = s.charAt(1) - '0';

        char endColumn = s.charAt(3);
        int endRow = s.charAt(4) - '0';

        List<String> res = new ArrayList<>();

        for (char ch = startColumn; ch <= endColumn;) {
            for (int i = startRow; i <= endRow; i++) {
                res.add(ch + "" + i);
            }
            ch = (char) (ch + 1);
        }
        return res;
    }
}