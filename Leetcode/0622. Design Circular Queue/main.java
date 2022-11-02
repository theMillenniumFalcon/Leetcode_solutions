class MyCircularQueue {
    int currentSize = 0;
    int size = 0;
    ListNode head, tail;

    public MyCircularQueue(int k) {
        this.size = k;
        this.head = null;
        this.tail = null;
    }

    public boolean enQueue(int value) {
        if (currentSize == size)
            return false;
        ListNode newNode = new ListNode(value);
        if (tail == null) {
            tail = newNode;
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = tail.next;
        }
        head.prev = tail;
        tail.next = head;
        currentSize++;
        return true;
    }

    public boolean deQueue() {
        if (head == null) {
            return false;
        }
        currentSize--;
        if (head == tail) {
            head = tail = null;
            return true;
        }
        head.next.prev = tail;
        tail.next = head.next;
        head = head.next;
        return true;
    }

    public int Front() {
        return head == null ? -1 : head.val;
    }

    public int Rear() {
        return tail == null ? -1 : tail.val;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == size;
    }
}

class ListNode {
    int val;
    ListNode prev;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}