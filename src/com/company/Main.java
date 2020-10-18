package com.company;

public class Main {

    public static void main(String[] args) {
	    createObject("Cat", 4).print();
	    createObject("Dog", 10).print();
        createObject("Monkey", 7).print();
        createObject("Horse", 100).print();
    }

    public static Entity createObject(String className, int size) {
        if (className.equals(Cat.class.getSimpleName())) {
            return new Cat(className, size);
        } else if (className.equals(Dog.class.getSimpleName())) {
            return new Dog(className, size);
        } else if (className.equals(Monkey.class.getSimpleName())) {
            return new Monkey(className, size);
        }else{
            return new Entity() {
                @Override
                public void print() {
                    System.out.println("No entity");
                }
            };
        }
    }
}
