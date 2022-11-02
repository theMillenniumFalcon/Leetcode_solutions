import java.util.Stack;

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
    // SC: O(n)
    int index = 0;

    public TreeNode recoverFromPreorder(String traversal) {
        return helper(traversal, 0);
    }

    public TreeNode helper(String str, int depth) {
        int temp = 0;

        while (index + temp < str.length() && str.charAt(index + temp) == '-') {
            temp++;
        }
        if (temp != depth) {
            return null;
        }

        int nd = 0;
        while (index + temp + nd < str.length() && str.charAt(index + temp + nd) != '-') {
            nd++;
        }
        int val = Integer.parseInt(str.substring(index + temp, index + temp + nd));
        index = index + temp + nd;

        TreeNode node = new TreeNode(val);
        node.left = helper(str, depth + 1);
        node.right = helper(str, depth + 1);

        return node;
    }
}