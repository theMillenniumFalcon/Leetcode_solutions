public class main {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

    public static void main(String[] args) {

    }

    // TC : O(n)
    // SC: O(1)
    public Node flatten(Node head) {
        if (head == null) return head;

        Node it = head;
        while (it != null) {
            if (it.child != null) {
                // the next node needs to cached somewhere
                Node next = it.next;
                it.next = flatten(it.child);
                it.next.prev = it;
                it.child = null;

                // move to the last node
                while (it.next != null) {
                    it = it.next;
                }

                if (next != null) {
                    it.next = next;
                    it.next.prev = it;
                }
            }
            it = it.next;
        }

        return head;
    }
}