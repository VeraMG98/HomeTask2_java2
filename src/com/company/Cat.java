package com.company;

public class Cat extends Entity {

    @Override
    public void print() {
        System.out.println("Meow");
        System.out.println(getName() + " " + getSize());
    }

    public Cat(String name, int size) {
        this.setName(name);
        this.setSize(size);
    }
}
