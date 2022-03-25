import java.util.LinkedList;
import java.util.Queue;

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

    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level_sum = 0;

        while(!queue.isEmpty()) {
            level_sum = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current_node = queue.poll();
                level_sum += current_node.val;
                if (current_node.left != null) queue.add(current_node.left);
                if (current_node.right != null) queue.add(current_node.right);
            }
        }

        return level_sum;
    }
}  