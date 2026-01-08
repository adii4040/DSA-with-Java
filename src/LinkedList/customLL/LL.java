package LinkedList.customLL;

public class LL {
    //In a linked-list, we have a node which contain the information of its - value and next node

    //Each node occupies certain space in the heap, and they are not continuous.
    //First node in the ll is known as "head"
    //Last node in the ll is known as "tail"
    //Since the nodes are not continuous, scattered around the heap, they are connected as "next"


    //Our main objective is to create the node so we will provide some methods to the user to perform certain operation on the node.

    //But since it is not continuous, we can not rely on the index value, we need to work with three components of the linked-list, they are: Head, Tail, Next
    //And we will also keep a size in order to make the linked-list  ever-growing.

    //Now, these head, tail, next are not user accessible, they can not access them because they are the core of the ll and no modification is required via user directly.

    private Node head;
    private Node tail;
    public int size;

    public LL() {
        this.size = 0;
    }

    public int size() {
        return this.size;
    }


    //Getter methods to perform the operations

    //Insert a node at the first
    public void insertFirst(int val) {
        //First we need to create a node
        Node node = new Node(val);
        //To insert a node at the first, we need to see two cases.

        //Then we are inserting the very first element of the ll, so this node will be both head and tail.

        //But how would we know that the ll is empty?
        if (tail == null) {
            tail = head;
        }
        node.next = head;
        head = node;
        size += 1;
    }

    //Insert a node at the last
    public void insertLast(int val) {
        //If the ll is empty, just call the insertFirst method
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    //Insert a node on an index
    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = new Node(val, temp.next);
        size++;

    }

    //Delete the first node
    public void deleteFirst() {
        if (size == 0) {
            throw new NullPointerException("No node to delete");
        }
        head = head.next;
        size--;
    }

    //Delete the last node
    public void deleteLast() {
        Node secondLastNode = getNodeAt(size - 2);
        tail = secondLastNode;
        secondLastNode.next = null;
        size--;
    }

    //Delete the specific indexed Node
    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }

        if (index == size) {
            deleteLast();
            return;
        }

        Node prevNode = getNodeAt(index - 1);
        prevNode.next = prevNode.next.next;
        size--;
    }

    private Node getNodeAt(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public Node findNode(int val) {
        Node node = head;
        while (node != null) {
            if (node.value == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    //Display the linked-list
    public void display() {
        //We will loop through the nodes, until we get the last node, and print them.

        //How do we determine if we are at the last node? If the current node is null, this means we are out of ll because tail points to the null

        //But we can't iterate the head, because if we do so, after one iteration, head will point to null, and after one iteration, we can no longer use this display method as head will always point to null.
        //Also according to the rule, head is the fist node of the ll, so we can never iterate it.

        //So we will have a temp node which will point to the head, we will iterate it.
        Node temp = head;


        while (temp != null) {
            System.out.print(temp.value + " -> ");
            //We know that if two reference var is pointing to the same object, changes in the one will lead to the change in the another.
            //But here we are not doing something  like temp.value = something, this will in fact lead to the change in the object

            //Here we are just reassigning the temp, changing its address, not the value.
            temp = temp.next;
        }

        System.out.println("Null");
    }

    //We are keeping this Node class private because we don't want the user to create a node directly, they will use a getter methods to perform the operation on the node.
    private class Node {
        private int value;
        private Node next; //Next is a node, by default its pointing to null

        public Node(int val) {
            this.value = val;
        }

        public Node(int val, Node next) {
            this.value = val;
            this.next = next;
        }

    }
}
