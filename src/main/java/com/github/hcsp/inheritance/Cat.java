package com.github.hcsp.inheritance;

public class Cat extends Animal{
    private String name;

    public Cat(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("喵" + this.name);
    }
}
