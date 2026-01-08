package LinkedList.customLL;

public class DoublyLL {

    private Node head;


    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head != null) {
            head.prev = node;
        }
        node.next = head;
        node.prev = null;
        head = node;
    }

    public void insertLast(int val) {
        if (head == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = node;
        node.prev = lastNode;
        node.next = null;
    }

    public void insert(int val, int index) {

        if (index == 0) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        Node prevNode = getNodeAt(index - 1);

        if (prevNode.next == null) {
            insertLast(val);
            return;
        }
        node.next = prevNode.next;
        prevNode.next.prev = node;

        node.prev = prevNode;
        prevNode.next = node;
    }

    public void insertAfter(int insertAfter, int insertingVal) {
        Node prevNode = findNode(insertAfter);
        Node node = new Node(insertingVal);

//        if(prevNode.next == null){
//            insertLast(insertingVal);
//            return;
//        }
        node.next = prevNode.next;
        if (prevNode.next != null) {
            prevNode.next.prev = node; //This way we are not calling the insertLast method and avoiding the  while loop in it.
        }
        prevNode.next = node;
        node.prev = prevNode;
    }

    public void insertBefore(int insertBefore, int insertingVal) {
        Node nextNode = findNode(insertBefore);
        Node node = new Node(insertingVal);

        if (nextNode.prev == null) {
            insertFirst(insertingVal);
            return;
        }
        nextNode.prev.next = node;
        node.prev = nextNode.prev;

        node.next = nextNode;
        nextNode.prev = node;
    }

    public void display() {
        Node temp = head;
        System.out.print("Null -> <- ");
        while (temp != null) {
            System.out.print(temp.value + " -> <- ");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    public Node findNode(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == val) {
                return temp;
            }
            temp = temp.next;
        }
        throw new NullPointerException("Value not found!");
    }

    private Node getNodeAt(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.value = val;
        }

        public Node(int val, Node prev, Node next) {
            this.value = val;
            this.prev = prev;
            this.next = next;
        }
    }
}
