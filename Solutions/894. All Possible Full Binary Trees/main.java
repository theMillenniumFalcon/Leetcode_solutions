import java.util.*;

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

    // TC : O(2^n)
    // SC: O(1)
    public List<TreeNode> allPossibleFBT(int n) {
        if (n == 0) {
            return null;
        }
        if (n == 1) {
            return List(0);
        }
    }
}