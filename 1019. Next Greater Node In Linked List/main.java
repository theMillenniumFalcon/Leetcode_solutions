import java.util.ArrayList;
import java.util.Stack;

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

    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> node_vals = new ArrayList<Integer>();

        ListNode temp = head;
        while (temp != null) {
            node_vals.add(temp.val);
            temp = temp.next; 
        }

        int[] output_arr = new int[node_vals.size()];
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < node_vals.size(); i++) {
            while (!stack.isEmpty() && node_vals.get(stack.peek()) < node_vals.get(i)) {
                output_arr[stack.pop()] = node_vals.get(i);
            }
            stack.push(i);
        }

        return output_arr;
    }
}