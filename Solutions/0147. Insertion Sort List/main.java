public class main {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }

    // TC : O(n^2)
    // SC: O(1)
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode preInsert;
        ListNode toInsert;
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode currIt = head;

        while (currIt != null && currIt.next != null) {
            if (currIt.val <= currIt.next.val) {
                currIt = currIt.next;
            } else {
                // out of sorting order
                toInsert = currIt.next;
                //locate preInsert
                preInsert = dummy;
                while (preInsert.next.val < toInsert.val) {
                    preInsert = preInsert.next;
                }
                currIt.next = toInsert.next;
                // Insert toInsert after preInsert
                toInsert.next = preInsert.next;
                preInsert.next = toInsert;
            }
        }

        return dummy.next;
    }
}