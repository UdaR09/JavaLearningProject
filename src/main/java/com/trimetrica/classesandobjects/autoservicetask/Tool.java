package com.trimetrica.classesandobjects.autoservicetask;

public class Tool {
    double price;
    String name;
    double weight;

    public Tool(String name){
        this.name = name;
        System.out.println("Un obiect tool numit " + this.name + " a fost creat" );
    }

    public Tool(){
        System.out.println("O nouă unealtă a fost creată. Nu dispunem de detalii despre ea." );
    }

}
