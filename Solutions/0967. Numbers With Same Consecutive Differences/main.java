import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(n)
    // SC: O(n)
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> list = new ArrayList<>();

        if (n == 1) {
            list.add(0);
        }

        dfs(n, k, list, 0);

        int[] res = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }

    public void dfs(int n, int k, List<Integer> list, int currentNumber) {
        if (n <= 0) {
            list.add(currentNumber);
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (i == 0 && currentNumber == 0) {
                continue;
            } else if (i != 0 && currentNumber == 0) {
                dfs(n - 1, k, list, i);
            } else if (Math.abs(currentNumber % 10 - i) == k) {
                dfs(n - 1, k, list, currentNumber * 10 + i);
            }
        }
    }
}