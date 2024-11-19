package com.trimetrica.accessmodifiers;

import com.trimetrica.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person ion001 = new Person("John", "Smith", 77777);
        System.out.println(ion001.firstName);
        System.out.println(ion001.getAge());

        Person olya001 = new Person("Olga", "Grozavu", 12442, 18, false);
        System.out.println(olya001.getAge());

        Person person = new Person("Valoare", "Valoare", 11111, 524, true);
        System.out.println(person.getAge());

        Person person2 = new Person("Constantin", "Morari", 45823, 65, true);
        Person person3 = new Person("Ionelia", "Dașchevici", 95456, 21, false);

        ion001.printRetirmentStatus();
        olya001.printRetirmentStatus();
        person.printRetirmentStatus();
        person2.printRetirmentStatus();
        person3.printRetirmentStatus();
    }
}
