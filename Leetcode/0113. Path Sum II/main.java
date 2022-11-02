import java.util.ArrayList;
import java.util.List;

public class main {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }

    // TC: O(n), n -> number of nodes in tree
    // SC: O(log(n)) -> auxiliary space, n -> number of nodes in tree
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> paths = new ArrayList<>();
        findPaths(root, targetSum, new ArrayList<Integer>(), paths);

        return paths;
    }

    public void findPaths(TreeNode root, int targetSum, List<Integer> current, List<List<Integer>> paths) {
        if (root == null) {
            return;
        }

        current.add(root.val);

        if (root.val == targetSum && root.left == null && root.right == null) {
            paths.add(current);
            return;
        }

        findPaths(root.left, targetSum - root.val, new ArrayList<Integer>(current), paths);
        findPaths(root.right, targetSum - root.val, new ArrayList<Integer>(current), paths);
    }
}