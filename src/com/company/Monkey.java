package com.company;

public class Monkey extends Entity {
    @Override
    public void print() {
        System.out.println("Y-y");
        System.out.println(getName() + " " + getSize());
    }

    public Monkey(String name, int size) {
        this.setName(name);
        this.setSize(size);
    }
}
