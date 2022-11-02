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

    // TC: O(n), n -> length of preorder and postorder
    // SC: O(n*log(n)) -> auxiliary space, n -> length of preorder and postorder
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n = preorder.length;
        return helper(preorder, 0, n - 1, postorder, 0, n - 1);
    }

    public TreeNode helper(int[] preorder, int preorderStartIndex, int preorderEndIndex,
            int[] postorder, int postorderStartIndex, int postorderEndIndex) {
        if (preorderStartIndex > preorderEndIndex) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preorderStartIndex]);

        if (preorderStartIndex == preorderEndIndex) {
            return root;
        }

        int index = postorderStartIndex;

        while (postorder[index] != preorder[preorderStartIndex + 1]) {
            index++;
        }

        int totalElements = index - postorderStartIndex + 1;

        root.left = helper(preorder, preorderStartIndex + 1, preorderStartIndex + totalElements, postorder,
                postorderStartIndex, index);
        root.right = helper(preorder, preorderStartIndex + totalElements + 1, preorderEndIndex, postorder, index + 1,
                postorderEndIndex);

        return root;
    }
}