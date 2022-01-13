package com.github.hcsp.inheritance;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("ABC");
        cat.speak();
        cat.sayName();

        Dog dog = new Dog("BCD");
        dog.speak();
        dog.sayName();

        Rat rat = new Rat("BCD");
        rat.speak();
        rat.sayName();
    }
}
