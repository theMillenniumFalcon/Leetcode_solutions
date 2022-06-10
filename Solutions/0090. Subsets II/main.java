import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(2^n * n). assuming the avearge length of every subset is n
    // SC: O(2^n) * O(k), assuming k to be the average length of subsets 
    // auxiliary space will be O(n), as this is the depth of recursion
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        findSubsets(0, nums, new ArrayList<>(), ans);

        return ans;
    }

    public void findSubsets(int index, int[] nums, List<Integer> ds, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(ds));

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;
            ds.add(nums[i]);
            findSubsets(i + 1, nums, ds, ans);
            ds.remove(ds.size() - 1);
        }
    }
}   