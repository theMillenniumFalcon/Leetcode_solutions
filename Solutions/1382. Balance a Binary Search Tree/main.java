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

    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        addtolist(root, list);
        return create(list, 0, list.size() - 1);
    }

    public TreeNode create(List<Integer> list, int si, int ei) {
        if (si > ei) return null;
        int mid = (si + ei) / 2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = create(list, si, mid - 1);
        root.right = create(list, mid + 1, ei);
        return root;
    }

    public void addtolist(TreeNode root, List<Integer> list) {
        if (root == null) return;
        addtolist(root.left, list);
        list.add(root.val);
        addtolist(root.right, list);
    }
}