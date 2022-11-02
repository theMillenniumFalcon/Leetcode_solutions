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

    // TC : O(n)
    // SC: O(1)
    TreeNode ancestor = null;
    int maxDepth = 0;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        getLeastAncestor(root, 1); 
        return ancestor;
    }
    
    public int getLeastAncestor(TreeNode root, int height) {
        if(root == null) return height;
        int left = getLeastAncestor(root.left, height + 1);
        int right = getLeastAncestor(root.right, height + 1);
        if(left == right && left >= maxDepth) {
            maxDepth = left;
            ancestor = root;
        }
        return Math.max(left, right);
    }
}