import java.util.Queue;
import java.util.LinkedList;

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

    // TC: O(n), n -> number of nodes
    // SC: O(n), n -> number of nodes
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newNode = new TreeNode(val);
            newNode.left = root;
            return newNode;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        depth = depth - 1;
        queue.offer(root);
        int level = 1;

        while (depth != level) {
            int size = queue.size();
            level++;

            while (size-- > 0) {
                TreeNode head = queue.poll();
                if (head.left != null) {
                    queue.offer(head.left);
                }
                if (head.right != null) {
                    queue.offer(head.right);
                }
            }
        }

        while (!queue.isEmpty()) {
            TreeNode head = queue.poll();
            TreeNode leftChild = head.left;
            TreeNode rightChild = head.right;

            TreeNode newLeft = new TreeNode(val);
            TreeNode newRight = new TreeNode(val);

            head.left = newLeft;
            head.right = newRight;

            newLeft.left = leftChild;
            newRight.right = rightChild;
        }

        return root;
    }
}