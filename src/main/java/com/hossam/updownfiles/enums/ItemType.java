package com.hossam.updownfiles.enums;

public enum ItemType {
    SPACE("SP"),
    FOLDER("FL"),
    FILE("FI");
    private final String type;
    ItemType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
