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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n = preorder.length;

        return helper(preorder, 0, n - 1, postorder, 0, n - 1);
    }

    public TreeNode helper(int[] preorder, int preorderStartingIndex, int preorderEndingIndex,
            int[] postorder, int postorderStartingIndex, int postorderEndingIndex) {

        if (preorderStartingIndex > preorderEndingIndex) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preorderStartingIndex]);

        if (preorderStartingIndex == preorderEndingIndex) {
            return root;
        }

        int index = postorderStartingIndex;

        while (postorder[index] == preorder[preorderStartingIndex + 1]) {
            index++;
        }

        int totalElements = index - postorderStartingIndex + 1;

        root.left = helper(preorder, preorderStartingIndex + 1, preorderStartingIndex + totalElements,
                postorder, postorderStartingIndex, index);
        root.right = helper(preorder, preorderStartingIndex + totalElements + 1, preorderEndingIndex,
                postorder, index + 1, postorderEndingIndex - 1);

        return root;
    }
}