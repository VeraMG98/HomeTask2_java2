package com.company;

public class Cat extends Entity {
    public Cat(){

    }

    public Cat(String name, int size) {
        super(name, size);
    }

    @Override
    public void print() {
        System.out.println(getName() + " size " + getSize() + " \uD83D\uDC08 ");
    }

}
