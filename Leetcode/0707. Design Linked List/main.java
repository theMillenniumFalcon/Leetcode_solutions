class MyLinkedList {

    Node dummyHead;
    Node dummyTail;
    int size;

    public MyLinkedList() {
        dummyHead = new Node();
        dummyTail = new Node();
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
        size = 0;
    }

    public Node getNode(int index) {
        if (index >= size)
            return null;
        if (index == 0)
            return dummyHead.next;
        if (index == size - 1)
            return dummyTail.prev;
        Node temp = dummyHead.next;
        while (index > 0) {
            temp = temp.next;
            index--;
        }
        return temp;
    }

    public int get(int index) {
        Node node = getNode(index);
        return node == null ? -1 : node.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val, dummyHead, dummyHead.next);
        dummyHead.next = node;
        node.next.prev = node;
        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val, dummyTail.prev, dummyTail);
        node.prev.next = node;
        dummyTail.prev = node;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index == size) {
            addAtTail(val);
        } else if (index == 0) {
            addAtHead(val);
        } else if (index < size && index > 0) {
            Node node = new Node(val, getNode(index - 1), getNode(index));
            getNode(index - 1).next = node;
            getNode(index).prev = node;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < size) {
            if (index == 0) {
                dummyHead.next = dummyHead.next.next;
                dummyHead.next.prev = dummyHead;
            } else if (index == size - 1) {
                dummyTail.prev = dummyTail.prev.prev;
                dummyTail.prev.next = dummyTail;
            } else {
                Node prevNode = getNode(index - 1);
                prevNode.next = prevNode.next.next;
                if (prevNode.next != null) {
                    prevNode.next.prev = prevNode;
                }
            }
            size--;
        }
    }

    class Node {
        int val;
        Node prev;
        Node next;

        Node() {
        }

        Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}
