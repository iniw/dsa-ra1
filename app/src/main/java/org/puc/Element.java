package org.puc;

class Element {
    private String id;
    private String description;
    private String extra; // Can be either a timestamp or a reason for service.

    Element next;

    Element(String id, String description, String extra) {
        this.id = id;
        this.description = description;
        this.extra = extra;
    }

    public String id() {
        return this.id;
    }

    public String description() {
        return this.description;
    }

    public String extra() {
        return extra;
    }
}
