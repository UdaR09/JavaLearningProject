package com.trimetrica.exceptionsservicetask;

public class ArithmeticOperationService {
    public static double divideInt(int a, int b) {
        return a / b;
    }

    public static double divideIntWithExceptionHandling(int a, int b) {
        try {
            double result = a / b;
            return result;
        } catch (RuntimeException e) {
            System.out.println("An exception has occurred" + e.getMessage());
            e.printStackTrace();
            return 0;
        }
    }
}
