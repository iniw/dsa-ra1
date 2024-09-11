package org.puc;

class Stack {
    private Element top;

    public Stack(Element... elements) throws Exception {
        for (var element : elements)
            this.push(element);
    }

    public void push(Element item) throws Exception {
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

    public Element pop() throws Exception {
        if (top == null) {
            throw new Exception("Cannot pop an empty stack.");
        } else if (top.next == null) {
            var last = top;
            top = null;
            return last;
        } else {
            Element next_to_last = null;
            Element last = top;
            for (; last.next != null; last = last.next)
                next_to_last = last;

            next_to_last.next = null;
            return last;
        }
    }

    public void print() {
        for (var node = top; node != null; node = node.next)
            System.out.printf("%s | %s | %s\n", node.id(), node.description(), node.extra());
    }
}
