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

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root = helper(nums, 0, nums.length - 1);
        return root;
    }

    public TreeNode helper(int arr[], int start, int end) {
        if (start > end) return null;
        if (start == end) return new TreeNode(arr[start]);

        int index = findMax(arr, start, end);
        TreeNode root = new TreeNode(arr[index]);
        root.left = helper(arr, start, index - 1);
        root.right = helper(arr, index + 1, end);

        return root;
    }

    public int findMax(int arr[], int start, int end) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        return index;
    }
} 