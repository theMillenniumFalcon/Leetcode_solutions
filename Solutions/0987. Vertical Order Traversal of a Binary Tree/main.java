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

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Pair> queue = new ArrayDeque<>();
        Map<Integer, List<Integer>> map = new TreeMap<>();

        queue.add(new Pair(0, root));
        while (!queue.isEmpty()) {
            Pair current = queue.poll();

            if (map.containsKey(current.horizontalDistance)) {
                map.get(current.horizontalDistance).add(current.node.val);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(current.node.val);
                map.put(current.horizontalDistance, temp);
            }

            if (current.node.left != null) {
                queue.add(new Pair(current.horizontalDistance - 1, current.node.left));
            }
            if (current.node.right != null) {
                queue.add(new Pair(current.horizontalDistance - 1, current.node.right));
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;
    }

    static class Pair {
        int horizontalDistance;
        TreeNode node;

        public Pair(int horizontalDistance, TreeNode node) {
            this.node = node;
            this.horizontalDistance = horizontalDistance;
        }
    }
} 