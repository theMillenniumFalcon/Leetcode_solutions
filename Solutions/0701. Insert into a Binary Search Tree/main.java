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

    // * RECUSRIVE SOLUTION --> Space complexity = O(No. of calls in recursive call stack)
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        } else if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }

    // * ITERATIVE SOLUTION --> Space Complexity = O(1)
    public TreeNode insertIntoBST2(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        TreeNode current = root;
        TreeNode parent = null;

        while (current != null) {
            parent = current;
            if (val < current.val) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (parent == null) {
            parent = newNode;
        } else if (val < parent.val) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }

        return parent;
    }
}