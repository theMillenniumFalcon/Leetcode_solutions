import java.util.List;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(9^k)
    // SC: O(k)
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, new ArrayList<Integer>(), k, 1, n);

        return ans;
    }

    public void helper(List<List<Integer>> ans, List<Integer> list, int k, int start, int n) {
        if (list.size() == k && n == 0) {
            List<Integer> li = new ArrayList<Integer>(list);
            ans.add(li);
            return;
        }
        for (int i = start; i <= 9; i++) {
            list.add(i);
            helper(ans, list, k, i + 1, n - i);
            list.remove(list.size() - 1);
        }
    }
}