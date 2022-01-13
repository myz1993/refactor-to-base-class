package com.github.hcsp.inheritance;

public class Rat extends Animal{
    private String name;

    public Rat(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("吱吱" + this.name);
    }
}
