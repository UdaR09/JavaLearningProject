package com.trimetrica.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Library librarius = new Library("Librarius");
        Library wikiLib = new Library("WikiLib");

        librarius.addBook(new Book("Punguta cu doi bani", "Vasile Alexandri"));
        librarius.addBook(new Book("Capra cu trei iezi", "Vasile Alexandri"));
        System.out.println("Librarius:");
        librarius.printBooks();

        wikiLib.addBook(new Book("Kill Bill", "Kventin Tarantion"));
        wikiLib.addBook(new Book("Shakespeare", "William Shakespeare"));
        System.out.println("WikiLib:");
        wikiLib.printBooks();

        Map<String, Library> libraries = new HashMap<>();

        libraries.put("Str. Moscova 11", librarius);
        libraries.put("Str. Kiev 7", wikiLib);

        String findLibrary = "Str. Moscova 11";
        boolean found = libraries.containsKey(findLibrary);
        System.out.println("\n" + findLibrary + ": " + found);

        if(found) {
            libraries.get(findLibrary).printBooks();
        }

        int[] integers = new int[5];
        integers[0] = 1;
        integers[1] = 3;
        integers[2] = 5;
        integers[3] = 4212;
        integers[4] = 21;

        System.out.println(integers.length);
        System.out.println(IntNumberArrayService.maxIntFromArray(integers));
        System.out.println(IntNumberArrayService.arithmeticAverage(integers));


    }
}
