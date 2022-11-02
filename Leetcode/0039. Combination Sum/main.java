import java.util.*;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(n * 2^k), k -> average length
    // SC: variable
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        findCombinations(0, candidates, target, res, new ArrayList<>());

        return res;
    }

    public void findCombinations(int index, int[] arr, int target, List<List<Integer>> res, List<Integer> ds) {
        if (index == arr.length) {
            if (target == 0) {
                res.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[index] <= target) {
            ds.add(arr[index]);
            findCombinations(index, arr, target - arr[index], res, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(index + 1, arr, target, res, ds);
    }
}