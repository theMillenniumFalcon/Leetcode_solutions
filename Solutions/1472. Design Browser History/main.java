class BrowserHistory {

    class Node {

        Node prev;
        Node next;

        String url;

        Node (String url) {
            this.url = url;
        }
    }

    Node current;

    public BrowserHistory(String homepage) {
        current = new Node(homepage);
    }
    
    public void visit(String url) {
        Node temp = new Node(url);
        current.next = temp;
        temp.prev = current;
        current = current.next;
    }
    
    public String back(int steps) {

        while (current.prev != null && steps --> 0) {
            current = current.prev;
        }

        return current.url;
    }
    
    public String forward(int steps) {

        while (current.next != null && steps --> 0) {
            current = current.next;
        }
        
        return current.url;
    }
}