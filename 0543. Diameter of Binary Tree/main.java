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

    public int diameterOfBinaryTree(TreeNode root) {
        int[] Max = new int[1];
        diameter(root, Max);
        return Max[0];
    }

    public int diameter(TreeNode root, int[] Max) {
        if (root == null) return 0;

        int leftHeight = diameter(root.left, Max);
        int rightHeight = diameter(root.right, Max);
        Max[0] = Math.max(Max[0], leftHeight + rightHeight);
    
        return 1 + Math.max(leftHeight, rightHeight);
    }
}