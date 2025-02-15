package com.trimetrica.exceptionsservicetask;

public class Main {
    public static void main(String[] args) {
        System.out.println(TextManager.getTheTextLength("Hello World"));
//        System.out.println(TextManager.getTheTextLength(null));
        System.out.println(TextManager.getTheTextLengthWithTryCatchFinally(null));
        System.out.println(TextManager.getTheTextLengthIfElse(null));
        System.out.println(ArithmeticOperationService.divideInt(10, 5));
//        System.out.println(ArithmeticOperationService.divideInt(10, 0));
        System.out.println(ArithmeticOperationService.divideIntWithExceptionHandling(10, 0));
    }
}
