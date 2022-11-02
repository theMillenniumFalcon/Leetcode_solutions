import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class main {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public static void main(String[] args) {

    }

    // TC: O(n)
    // SC: O(n)
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> NodesAtOneLevel = new ArrayList<>();

            while (size-- > 0) {
                Node head = queue.poll();
                NodesAtOneLevel.add(head.val);

                for (Node child : head.children) {
                    queue.offer(child);
                }
            }
            res.add(NodesAtOneLevel);
        }

        return res;
    }
}
