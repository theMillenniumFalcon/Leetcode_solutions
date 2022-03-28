import java.util.*;

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

    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        boolean ans = helper(root, k, set);
        
        return ans;
    }

    public boolean helper(TreeNode root, int sum, HashSet<Integer> set) {
        if (root == null) return false;

        if (helper(root.left, sum, set) == true) return true;

        int compliment = sum - root.val;
        if (set.contains(compliment)) return true;

        set.add(root.val);

        return helper(root.right, sum, set);
    }
}