package com.trimetrica.bookcollectiontask;

public class IntNumberArrayService {
    public static int maxIntFromArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double arithmeticAverage(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return (double) sum / array.length;
    }
}
