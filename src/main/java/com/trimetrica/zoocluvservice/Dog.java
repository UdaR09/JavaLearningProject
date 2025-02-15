package com.trimetrica.zoocluvservice;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Fresh meat - hammn");
    }

    public void makeSound() {
        System.out.println("Hamn - hamn");
    }
}
