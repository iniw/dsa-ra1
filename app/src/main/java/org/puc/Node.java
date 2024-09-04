package org.puc;

import java.time.LocalDateTime;

class Node {
    private int id;
    private String desc;
    private LocalDateTime timestamp;
    Node next;

    Node(int id, String desc) {
        this.id = id;
        this.desc = desc;

        this.timestamp = LocalDateTime.now();
    }

    public int id() {
        return this.id;
    }

    public String desc() {
        return this.desc;
    }

    public LocalDateTime timestamp() {
        return timestamp;
    }
}
