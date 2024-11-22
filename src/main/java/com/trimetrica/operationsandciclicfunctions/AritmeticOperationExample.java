package com.trimetrica.operationsandciclicfunctions;

public class AritmeticOperationExample {
    public static void main(String[] args) {
        int result, a = 43, c = 3;

        //Sum
        result = a + c;
        System.out.println("Suma: " + result + "\nSuma: " + (a + c));

        //Substraction
        result = a - c;
        System.out.println("Rezultat: " + result);

        //Multiplication
        result = a * c;
        System.out.println("Înmulțirea: " + result);

        //Devision
        result = a / c;
        System.out.println("Împărțirea: " + result);

        //The rest of the devision
        result = a % c;
        System.out.println("Restul împărțirii  " + a +" % " + c + " = " + result);
    }
}
