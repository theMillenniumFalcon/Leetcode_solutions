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
    int index = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public TreeNode helper(int[] preorder, int start, int end) {
        if (index == preorder.length || preorder[index] < start || preorder[index] > end) return null;

        int val = preorder[index];
        index++;

        TreeNode node = new TreeNode(val);

        node.left = helper(preorder, start, val);
        node.right = helper(preorder, val, end);

        return node;
    }
}