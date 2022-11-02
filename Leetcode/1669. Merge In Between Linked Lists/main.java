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
    // SC: O(1)
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1, aNode = null, bNode = null;
        int index = 0;

        while (temp != null) {
            if (index == a - 1) {
                aNode = temp;
            } else if (index == b + 1){
                bNode = temp;
            }
            temp = temp.next;
            index++;
        }

        aNode.next = list2;
        getTail(list2).next = bNode;

        return list1;
    }

    public ListNode getTail(ListNode node) {
        while(node.next != null) {
            node = node.next;
        }

        return node;
    }
}