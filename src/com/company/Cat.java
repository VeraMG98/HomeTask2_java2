package com.company;

public class Cat extends Entity {

    public Cat(String name, int size) {
        super(name, size);
    }

    @Override
    public void print() {
        System.out.println("Meow");
        System.out.println(getName() + " " + getSize());
    }

}
