package com.trimetrica.exceptionsservicetask;

public class TextManager {
    public static int getTheTextLength(String inputString) {
        return inputString.length();
    }

    public static int getTheTextLengthWithTryCatchFinally(String inputString) {
        try {
            return inputString.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
            return 0;
        }finally {
            System.out.println("finally block");
        }
    }

    public static int getTheTextLengthIfElse(String inputString) {
        if (inputString == null) {
            System.out.println("inputString is null");
            return 0;
        }else {
            return inputString.length();
        }
    }
}
