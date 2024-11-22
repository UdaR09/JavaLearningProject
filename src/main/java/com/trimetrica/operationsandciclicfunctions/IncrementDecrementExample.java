package com.trimetrica.operationsandciclicfunctions;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int a = 5, b, c, a1;

        //Incrementare
        a++;
        System.out.println("Valoarea după incrementare: " + "\n a = " + a);

        //Incrementare pre-fixată
        b = ++a;
        a1 = a;
        c = a++;
        System.out.println("Valoarea după incrementare pre-fixată: " + "\nb = " + b+ "; a = " + a1 + "\nc = " + c + ", a = " + a);

        //Decrementare
        a--;
        System.out.println("Valoarea după decrementare: " + "\n a = " + a);

        //Decrementare pre-fixată
        b = --a;
        a1 = a;
        c = a--;
        System.out.println("Valoarea după decrementare pre-fixată: " + "\nb = " + b+ "; a = " + a1 + "\nc = " + c + ", a = " + a);
    }
}
