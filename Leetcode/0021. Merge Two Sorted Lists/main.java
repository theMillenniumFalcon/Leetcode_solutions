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

    // TC : O(n)
    // SC: O(n)
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                dummy.next = list1;
                list1 = list1.next;
            } else {
                dummy.next = list2;
                list2 = list2.next;
            }
            dummy = dummy.next;
        }

        if (list1 != null) {
           dummy.next = list1; 
        } else {
            dummy.next = list2;
        }

        return head.next;
    }

    // OPTIMIZED --> IN PLACE
    // TC : O(n)
    // SC: O(1)
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }

        ListNode res = list1;

        while (list1 != null && list2 != null) {
            ListNode tmp = null;

            while (list1 != null && list1.val <= list2.val) {
                tmp = list1;
                list1 = list1.next;
            }
            tmp.next = list2;

            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }

        return res;
    }
}