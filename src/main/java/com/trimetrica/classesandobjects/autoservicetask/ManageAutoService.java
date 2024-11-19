package com.trimetrica.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {
        Car mercedesBenzSeriaE = new Car("E Class", "Mercedes", "Verde");
        Car vwPolo = new Car("SRR 009");
        Car volvoXC90 = new Car("VOR 666");

        Tool ciocan = new Tool("Ciocan");
        Tool surubelnita = new Tool();

        Worker ionCiobanu = new Worker();

        Garage garageBastovka = new Garage();

        mercedesBenzSeriaE.plateNumber = "NUB 222";
        mercedesBenzSeriaE.kmWhenEnteredTheService = 455234;

        vwPolo.make = "Polo";
        vwPolo.model = "VolksWagen";
        vwPolo.color = "Argint";
        vwPolo.kmWhenEnteredTheService = 35442;

        volvoXC90.make = "XC90";
        volvoXC90.model = "Volvo";
        volvoXC90.color = "Negru";
        volvoXC90.kmWhenEnteredTheService = 85442;

        System.out.println("Masina: "+ mercedesBenzSeriaE.model + " " + mercedesBenzSeriaE.make + "\nCuloarea: "+ mercedesBenzSeriaE.color + "\nNumarul de imatricualre: "+ mercedesBenzSeriaE.plateNumber+"\nKilometrajul: "+ mercedesBenzSeriaE.kmWhenEnteredTheService);
        System.out.println("Masina: "+ vwPolo.model + " " + vwPolo.make + "\nCuloarea: "+ vwPolo.color + "\nNumarul de imatricualre: "+ vwPolo.plateNumber+"\nKilometrajul: "+ vwPolo.kmWhenEnteredTheService);
        System.out.println("Masina: "+ volvoXC90.model + " " + volvoXC90.make + "\nCuloarea: "+ volvoXC90.color + "\nNumarul de imatricualre: "+ volvoXC90.plateNumber+"\nKilometrajul: "+ volvoXC90.kmWhenEnteredTheService);

        ciocan.weight = 1.64;

        surubelnita.name = "Șurubelniță";
        surubelnita.weight = 0.075;

        System.out.println("Instrumetul: " + ciocan.name + "Greutate: " + ciocan.weight);
        System.out.println("Instrumetul: " + surubelnita.name + "Greutate: " + surubelnita.weight);

    }
}
