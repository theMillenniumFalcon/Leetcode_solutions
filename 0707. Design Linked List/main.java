class MyLinkedList {

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

    ListNode head;
    int size;

    public MyLinkedList() {
        
    }

    public int get(int index) {
        if (index >= size) {
            return -1;
        }

        int counter = 0;
        ListNode temp = head;
        while (counter < index) {
            temp = temp.next;
            counter++;
        }
        return temp.val;
    }

    public void addAtHead(int val) {

    }

    public void addAtTail(int val) {

    }

    public void addAtIndex(int index, int val) {

    }

    public void deleteAtIndex(int index) {

    }
}