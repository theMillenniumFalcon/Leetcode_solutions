import java.util.LinkedList;
import java.util.List;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(n), n -> length of the data stream
    // SC: O(1)
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new LinkedList<>();
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (j >= target.length) {
                break;
            }
            if (i != target[j]) {
                res.add("Push");
                res.add("Pop");
            } else {
                res.add("Push");
                j++;
            }
        }

        return res;
    }
}