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

    // TC : O(n), n -> no. of nodes
    // SC: O(1)
    public int diameterOfBinaryTree(TreeNode root) {
        // since in java, we cannot pass reference to variables
        int[] Max = new int[1];
        height(root, Max);
        return Max[0];
    }

    public int height(TreeNode root, int[] Max) {
        if (root == null) return 0;

        int leftHeight = height(root.left, Max);
        int rightHeight = height(root.right, Max);
        Max[0] = Math.max(Max[0], leftHeight + rightHeight);
    
        return 1 + Math.max(leftHeight, rightHeight);
    }
}