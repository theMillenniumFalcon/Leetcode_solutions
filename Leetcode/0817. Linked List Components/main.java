import java.util.*;

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
    // SC: O(nums.length)
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        int ans = 0;
        while (head != null) {
            boolean count = true;
            while (set.contains(head.val)) {
                if (count) {
                    ans++;
                }
                count = false;
                if (head.next != null) {
                    head = head.next;
                } else {
                    break;
                }
            }
            head = head.next;
        }
        
        return ans;
    }
}