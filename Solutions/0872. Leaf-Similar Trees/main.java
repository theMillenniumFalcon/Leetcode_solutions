import java.util.List;
import java.util.ArrayList;

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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        dfs(leaves1, root1);
        dfs(leaves2, root2);

        return leaves1.equals(leaves2);
    }

    public void dfs(List<Integer> leafValues, TreeNode root) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            leafValues.add(root.val);
        }

        dfs(leafValues, root.left);
        dfs(leafValues, root.right);
    }
} 