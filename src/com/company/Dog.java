package com.company;

public class Dog extends Entity {
    @Override
    public void print() {
        System.out.println("Woof");
        System.out.println(getName() + " " + getSize());
    }

    public Dog(String name, int size) {
        this.setName(name);
        this.setSize(size);
    }
}
