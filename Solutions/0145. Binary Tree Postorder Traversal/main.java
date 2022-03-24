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

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if (root == null) return ans;
        ans.addAll(postorderTraversal(root.left));
        ans.addAll(postorderTraversal(root.right));
        if (root != null) {
            ans.add(root.val);
        }

        return ans;
    }
}  