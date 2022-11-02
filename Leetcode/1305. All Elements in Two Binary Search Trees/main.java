import java.util.*;

import javax.swing.plaf.metal.MetalRadioButtonUI;

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

    // TC : O(?)
    // SC: O(?)
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        inorderTraversal(root1, list1);

        List<Integer> list2 = new ArrayList<>();
        inorderTraversal(root2, list2);

        return merge(list1, list2);
    }

    public void inorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }

    public List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> res = new ArrayList<>();
        int start1 = 0;
        int start2 = 0;

        while (start1 < list1.size() && start2 < list2.size()) {
            if (list1.get(start1) < list2.get(start2)) {
                res.add(list1.get(start1));
                start1++;
            } else {
                res.add(list2.get(start2));
                start2++;
            }
        }

        while (start1 < list1.size()) {
            res.add(list1.get(start1));
            start1++;
        }
        while (start2 < list2.size()) {
            res.add(list2.get(start2));
            start2++;
        }

        return res;
    }
}