package com.trimetrica.operationsandciclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {
        int a = 8, b = 4, result;

        //Atribuire simplă
        result = a;
        System.out.println("Atribuire simplă: " + result);

        //Atribuire cu adunare
        result += b;
        System.out.println("Atribuire cu adunare: " + result);

        //Atribuire cu scădere
        result -= b;
        System.out.println("Atribuire cu scădere: " + result);

        //Atribuire cu înmulțire
        result *= b;
        System.out.println("Atribuire cu înmulțire: " + result);

        //Atribuire cu împărțire
        result /= b;
        System.out.println("Atribuire cu împărțire: " + result);

        //Atribuire cu restul împărțirii
        result %= b;
        System.out.println("Atribuire cu restul împărțirii: " + result);
    }
}
