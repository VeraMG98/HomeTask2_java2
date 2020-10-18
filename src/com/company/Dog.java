package com.company;

public class Dog extends Entity {

    public Dog(){}
    public Dog(String name, int size) {
        super(name, size);
    }

    @Override
    public void print() {
        System.out.println("Woof");
        System.out.println(getName() + " " + getSize());
    }
}
