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

    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr = new int[2];
        if (head.next.next == null) {
            int[] ans = new int[2];
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }

        ListNode current = head.next;
        ListNode prev = head;
        ListNode front = current.next;

        int pos = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while (current != null && front != null && prev != null) {
            pos++;
            if (((prev.val < current.val) && (current.val > front.val))
                    || ((prev.val > current.val) && (current.val < front.val))) {
                list.add(pos);
            }

            if (current != null && current.next != null) {
                current = current.next;
                prev = prev.next;
                front = front.next;
            }
        }

        if (list.size() < 2) {
            arr[0] = -1;
            arr[1] = -1;
            return arr;
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list.size() - 1; i++) {
            int c = list.get(i);
            int n = list.get(i + 1);
            int diff = Math.abs(n - c);
            if (diff < min)
                min = diff;
        }

        arr[0] = min;
        arr[1] = list.get(list.size() - 1) - list.get(0);
        return arr;
    }
}