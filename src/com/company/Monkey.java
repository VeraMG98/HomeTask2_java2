package com.company;

public class Monkey extends Entity {
    public Monkey() {}
    public Monkey(String name, int size) {
        super(name, size);
    }

    @Override
    public void print() {
        System.out.println(getName() + " size " + getSize() + " \uD83D\uDC12");
    }
}
