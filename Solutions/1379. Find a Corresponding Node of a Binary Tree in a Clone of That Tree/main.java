public class main {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original != null) {
            if (original == target) return cloned;
            TreeNode node = getTargetCopy(original.left, cloned.left, target);
            if (node != null) return node;
            return getTargetCopy(original.right, cloned.right, target); 
        }

        return null;
    }
}