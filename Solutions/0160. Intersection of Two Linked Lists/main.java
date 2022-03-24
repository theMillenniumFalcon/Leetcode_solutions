public class main {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode smaller = headA;
        ListNode longer = headB;

        while (smaller != longer) {

            if (smaller == null) {
                smaller = headB;
            } else {
                smaller = smaller.next;
            }

            if (longer == null) {
                longer = headA;
            } else {
                longer = longer.next;
            }
        }

        return smaller;
    }

}