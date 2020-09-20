package com.company;

public class Monkey extends Entity {
    public Monkey(String name, int size) {
        super(name, size);
    }

    @Override
    public void print() {
        System.out.println("Y-y");
        System.out.println(getName() + " " + getSize());
    }
}
