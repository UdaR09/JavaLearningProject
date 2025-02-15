package com.trimetrica.zoocluvservice;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Fish food - myauu");
    }
    public void makeSound() {
        System.out.println("Mauuuuuw, myaaaaaaaaaaaaaaaawwwwwwwwwwwwwww");
    }
}
