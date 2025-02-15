package com.trimetrica.zoocluvservice;

public class Lion extends Animal{
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Fresh meat - mauw");
    }

    public void makeSound() {
        System.out.println("Hhhrrrrr - maw");
    }
}
