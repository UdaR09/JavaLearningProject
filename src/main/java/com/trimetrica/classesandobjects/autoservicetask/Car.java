package com.trimetrica.classesandobjects.autoservicetask;

public class Car {
    String plateNumber;
    int kmWhenEnteredTheService;
    String color;
    String make;
    String model;

    public  Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public  Car(String palteNumber){
        this.plateNumber = palteNumber;
    }
}
