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

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode xParent = null;
        TreeNode yParent = null;
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                    if (node.left.val == x) {
                        xParent = node;
                    }
                    if (node.left.val == y) {
                        yParent = node;
                    }
                }
                if (node.right != null) {
                    queue.add(node.right);
                    if (node.right.val == x) {
                        xParent = node;
                    }
                    if (node.right.val == y) {
                        yParent = node;
                    }
                }
                if (xParent != null && yParent != null) {
                    return xParent != yParent;
                }
            }

            if ((xParent == null && yParent != null) || (xParent != null && yParent == null)) {
                return false;
            }
        }

        return false;
    }
}