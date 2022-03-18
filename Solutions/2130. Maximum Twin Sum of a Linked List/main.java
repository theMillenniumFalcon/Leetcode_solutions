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

    public int pairSum(ListNode head) {
        int max=0;
        ListNode fast = head;
        ListNode slow = head;
        ListNode dummy_head = head;

        while(fast.next !=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode current = slow.next;
        ListNode prev = null;

        while(current != null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        ListNode head2 = prev;

        while(dummy_head != null && head2 !=null){
            if(dummy_head.val + head2.val > max){
                max = dummy_head.val + head2.val;
            }
            dummy_head = dummy_head.next;
            head2 = head2.next;
        }
        return max;
    }
}