package com.trimetrica.operationsandciclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {
        int testResult = 90;

        if (testResult >= 90)
            System.out.println("Calificativul A");
        else if (testResult >= 80)
            System.out.println("Calificativul B");
        else if (testResult >= 70)
            System.out.println("Calificativul C");
        else if (testResult >= 60)
            System.out.println("Calificativul D");
        else
            System.out.println("Ne calificat!");

        System.out.println("Finita la program");
    }
}
