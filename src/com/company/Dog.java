package com.company;

public class Dog extends Entity {

    public Dog(){}
    public Dog(String name, int size) {
        super(name, size);
    }

    @Override
    public void print() {
        System.out.println(getName() + " size "  + getSize() + " \uD83D\uDC15");
    }
}
