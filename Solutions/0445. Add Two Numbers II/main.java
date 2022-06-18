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

    // TC : O(max(l1, l2))
    // SC: O(max(l1, l2))
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return l1 != null ? l1 : l2;

        ListNode reverseL1 = reverse(l1);
        ListNode reverseL2 = reverse(l2);

        ListNode head = new ListNode(-1);
        ListNode iterator = head;

        int carry = 0;

        while (reverseL1 != null || reverseL2 != null || carry != 0) {
            int sum = carry + (reverseL1 != null ? reverseL1.val : 0) + (reverseL2 != null ? reverseL2.val : 0);

            int digit = sum % 10;
            carry = sum / 10;

            iterator.next = new ListNode(digit);
            iterator = iterator.next;

            if (reverseL1 != null) reverseL1 = reverseL1.next;
            if (reverseL2 != null) reverseL2 = reverseL2.next;
        }

        return reverse(head.next);
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}