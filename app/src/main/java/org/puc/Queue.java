package org.puc;

public class Queue {
    private Node head;
    private Node tail;

    void push(Node item) {
        if (head == null) {
            tail = head = item;
        } else {
            tail = tail.next = item;
        }
    }

    Node pop() throws Exception {
        if (head == null)
            throw new Exception("Cannot pop an empty queue.");

        Node last = head.next;
        head = head.next;
        return last;
    }

    public void print() {
        for (var node = head; node != null; node = node.next)
            System.out.printf("id = %d, desc = %s\n", node.id(), node.desc());
    }
}
