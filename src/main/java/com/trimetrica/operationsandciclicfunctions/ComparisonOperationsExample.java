package com.trimetrica.operationsandciclicfunctions;

public class ComparisonOperationsExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        boolean isCompared;

        //Egal cu
        isCompared = a == b;
        System.out.println("Egal cu: " + isCompared);

        //Diferit de
        isCompared = a != b;
        System.out.println("Diferit de: " + isCompared);

        //Mai mare decât
        isCompared = a > b;
        System.out.println("Mai mare decât: " + isCompared);

        //Mai mic decât
        isCompared = a < b;
        System.out.println("Mai mic decât: " + isCompared);

        //Mai mare sau egal cu
        isCompared = a >= b;
        System.out.println("Mai mare sau egal cu: " + isCompared);

        //Mai mic sau egal cu
        isCompared = a <= b;
        System.out.println("Mai mic sau egal cu: " + isCompared);
    }
}
