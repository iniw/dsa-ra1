package org.puc;

import java.time.LocalDateTime;

class Node {
    int id;
    String desc;
    LocalDateTime timestamp;
    Node next;

    Node(int id, String desc) {
        this.id = id;
        this.desc = desc;

        this.next = null;
        this.timestamp = LocalDateTime.now();
    }

    public int id() {
        return this.id;
    }

    public String desc() {
        return this.desc;
    }
}
