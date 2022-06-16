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

    // TC : O(n), n -> number of nodes in tree
    // SC: O(n)
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> remaining = new ArrayList<>();
        Set<Integer> toDelete = new HashSet<>();

        for (int i : to_delete) {
            toDelete.add(i);
        }

        removeNodes(root, toDelete, remaining);

        if (!toDelete.contains(root.val)) {
            remaining.add(root);
        }

        return remaining;
    }

    public TreeNode removeNodes(TreeNode root, Set<Integer> toDelete, List<TreeNode> remaining) {
        if (root == null) return null;

        root.left = removeNodes(root.left, toDelete, remaining);
        root.right = removeNodes(root.right, toDelete, remaining);

        if (toDelete.contains(root.val)) {
            if (root.left != null) {
                remaining.add(root.left);
            }
            if (root.right != null) {
                remaining.add(root.right);
            }

            return null;
        }

        return root;
    }
}