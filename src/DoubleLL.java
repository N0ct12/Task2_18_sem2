public class DoubleLL {
    private static class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node(int value) {
            this(value, null,null);
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }

    private Node head;
    private Node tail;

    private int size;

    public DoubleLL() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(int val) {
        Node n = new Node(val, head, null);
        if (isEmpty()) {
            tail = head = n;
        }
        head.setPrev(n);
        head = n;
        size++;
    }

    public void addLast(int val) {
        Node n = new Node(val);
        if (isEmpty()) {
            head = tail = n;
        }
        tail.next = n;
        n.setPrev(tail);
        tail = n;
        tail.setNext(null);
        size++;
    }

    public String asString() {
        Node current = head.getNext();
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(head.getValue());
        for (int i = 1; i < size; i++) {
            sb.append(", ").append(current.getValue());
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

    public void solve(int index) {
//        Node current = head.getNext();
//        current = current.getPrev();
//        return current.getValue();
        if(index<0 || index>size()-1) throw new IndexOutOfBoundsException("Index is out of bounds");

        if(size()-index >= index+1){
            Node current = head;
            for (int i = 0; i <= index; i++) {
                System.out.println(current.getValue());
                current = current.getNext();
            }
        }else{
            Node current = tail;
            for (int i = size()-1; i >= index; i--) {
                System.out.println(current.getValue());
                current = current.getPrev();
            }
        }
    }
}
