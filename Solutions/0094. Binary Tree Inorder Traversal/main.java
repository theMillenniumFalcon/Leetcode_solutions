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

    // TC: O(n)
    // SC: O(log(n)) -> auxiliary space
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if (root == null) {
            return res;
        }
        res.addAll(inorderTraversal(root.left));
        if (root != null) {
            res.add(root.val);
        }
        res.addAll(inorderTraversal(root.right));

        return res;
    }
}