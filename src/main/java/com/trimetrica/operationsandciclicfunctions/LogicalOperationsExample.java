package com.trimetrica.operationsandciclicfunctions;

public class LogicalOperationsExample {
    public static void main(String[] args) {
        boolean a = true, b = false, result;

        result = a && b;
        System.out.println("Logic and: " + result);

        //a = true
        a = result && b;
        //a = false
        System.out.println("Logic and: " + a);

        //result = false
        result = a || b;
        System.out.println("Logic or: " + result);

        System.out.println("Negation: " + !result);
    }
}
