import java.util.List;
import java.util.ArrayList;

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

    // TC: O(n)
    // SC: O(n)
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head;
        List<ListNode> li = new ArrayList<ListNode>();
        List<ListNode> li2 = new ArrayList<ListNode>();
        while (temp != null) {
            li.add(temp);
            temp = temp.next;
        }
        int max = li.get(li.size() - 1).val;
        for (int i = li.size() - 1; i >= 0; i--) {
            int val = li.get(i).val;
            if (max <= val) {
                max = val;
                li2.add(li.get(i));
            }
        }

        head = li2.get(li2.size() - 1);
        ListNode t = null;
        for (int i = li2.size() - 1; i >= 1; i--) {
            t = li2.get(i);
            t.next = li2.get(i - 1);
        }

        return head;
    }
}