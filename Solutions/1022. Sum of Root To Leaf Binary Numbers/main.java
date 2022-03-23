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

    private int totalSum = 0;
    public int sumRootToLeaf(TreeNode root) {
        if (root == null) return 0;
        sumRootToLeafDfs(root, 0);
        return totalSum;
    }

    public void sumRootToLeafDfs(TreeNode root, int currentSum) {
        if (root == null) return;

        currentSum = currentSum + root.val;

        if (root.left == null && root.right == null) {
            totalSum += currentSum;
            return;
        }

        sumRootToLeafDfs(root.left, currentSum * 2);
        sumRootToLeafDfs(root.right, currentSum * 2);
    }
}