package com.company;

public abstract class Entity implements Printable {
    private String name;
    private int size;

    public Entity(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
