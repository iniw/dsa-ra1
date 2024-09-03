package org.puc;

class Stack {
    private Node top;

    public void push(Node item) throws Exception {
        if (top == null) {
            top = item;
        } else {
            var last = top;
            while (last.next != null)
                last = last.next;
            last.next = item;
        }
    }

    public boolean is_empty() {
        return top == null;
    }

    public Node pop() throws Exception {
        if (top == null) {
            throw new Exception("Cannot pop an empty stack.");
        } else if (top.next == null) {
            var last = top;
            top = null;
            return last;
        } else {
            Node next_to_last = null;
            Node last = top;
            for (; last.next != null; last = last.next)
                next_to_last = last;

            next_to_last.next = null;
            return last;
        }
    }

    public void print() {
        for (var node = top; node != null; node = node.next)
            System.out.printf("id = %d, desc = %s\n", node.id(), node.desc());
    }
}
