package org.puc;

public class Queue {
    private Element head;
    private Element tail;

    public Queue(Element... elements) throws Exception {
        for (var element : elements)
            this.push(element);
    }

    void push(Element item) {
        if (head == null) {
            tail = head = item;
        } else {
            tail = tail.next = item;
        }
    }

    Element pop() throws Exception {
        if (head == null)
            throw new Exception("Cannot pop an empty queue.");

        var last = head;
        head = head.next;
        return last;
    }

    public void print() {
        for (var node = head; node != null; node = node.next)
            System.out.printf("%s | %s | %s\n", node.id(), node.description(), node.extra());
    }
}
