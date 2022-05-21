import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Codec {

    // Encodes a tree to a single string.
    // TC : O(n)
    // SC: O(1)
    public String serialize(TreeNode root) {
        if (root == null) return "null,";

        String leftSubTreeSerialize = serialize(root.left);
        String rightSubTreeSerialize = serialize(root.right);

        return root.val + "," + leftSubTreeSerialize + rightSubTreeSerialize;
    }

    // Decodes your encoded data to tree.
    // TC : O(n)
    // SC: O(n)
    public TreeNode deserialize(String data) {
        Queue<String> nodesLeft = new LinkedList<>();
        nodesLeft.addAll(Arrays.asList(data.split(",")));

        return helper(nodesLeft);
    }

    public TreeNode helper(Queue<String> nodesLeft) {
        String current = nodesLeft.poll();
        if (current.equals("null")) return null;

        TreeNode newNode = new TreeNode(Integer.valueOf(current));

        newNode.left = helper(nodesLeft);
        newNode.right = helper(nodesLeft);

        return newNode;
    }
}