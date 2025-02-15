package com.trimetrica.zoocluvservice;

import com.trimetrica.methodstask.DataGeneratorUtil;

public class ZooService {
    public static void main(String[] args) {
        Animal cat001 = new Cat("Tomson", DataGeneratorUtil.getRandomNumber(10));
        Dog dog001 = new Dog("Jack", DataGeneratorUtil.getRandomNumber(20));
        Lion lion001 = new Lion("Timmy", DataGeneratorUtil.getRandomNumber(30));

        System.out.println("Name: " + cat001.getName() + " Age: " + cat001.getAge());
        cat001.eat();
        cat001.makeSound();

        System.out.println("Name: " + dog001.getName() + " Age: " + dog001.getAge());
        dog001.eat();
        dog001.makeSound();

        System.out.println("Name: " + lion001.getName() + " Age: " + lion001.getAge());
        lion001.eat();
        lion001.makeSound();
    }
}
