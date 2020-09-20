package com.company;

public class Main {

    public static void main(String[] args) {
	    Cat cat = new Cat("Cat", 3);
	    Dog dog = new Dog("Dog", 15);
	    Monkey monkey = new Monkey("Monkey", 7);

	    Entity[] entities = new Entity[] {cat, dog, monkey};
        for (Entity entity: entities) {
            entity.print();
        }
    }
}
