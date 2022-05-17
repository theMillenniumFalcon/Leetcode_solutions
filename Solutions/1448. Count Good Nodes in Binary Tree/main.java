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
    // SC: O(log n)
    int count = 0;
    public int goodNodes(TreeNode root) {
        goodNodesUtil(root, Integer.MIN_VALUE);
        return count;
    }
    
    private void goodNodesUtil(TreeNode root, int max){
        if(root == null)
            return;
        if(root.val >= max){
            count++;
            max = root.val;
        }
        
        goodNodesUtil(root.left, max);
        goodNodesUtil(root.right, max);
        return;
    }
}
