package com.github.hcsp.inheritance;

public class Dog extends Animal{
    private String name;

    public Dog(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("汪" + this.name);
    }
}
