import java.util.*;

public class main {
    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public static void main(String[] args) {

    }

    public Node cloneGraph(Node node) {
        HashMap<Node, Node> map = new HashMap<>();
        if (map.containsKey(node)) {
            return map.get(node);
        }

        
    }

}