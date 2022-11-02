import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(2^n)
    // SC: O(n)
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(candidates, 0, target, new ArrayList<Integer>(), res);

        return res;
    }

    public void findCombinations(int[] candidates, int index, int target, List<Integer> current, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) return;

        for (int i = index; i < candidates.length; i++) {
            if (i == index || candidates[i] != candidates[i - 1]) {
                current.add(candidates[i]);
                findCombinations(candidates, i + 1, target - candidates[i], current, res);
                current.remove(current.size() - 1);
            }
        }
    }
}