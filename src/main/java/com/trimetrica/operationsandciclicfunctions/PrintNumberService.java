package com.trimetrica.operationsandciclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int a = 500, limit = 500;

        while (a > 0)
            System.out.print(a-- + ", ");

        System.out.println();

        do
            System.out.print(a++ + ", ");
        while (a < limit);

        System.out.println();

        for (int i = 1; i <= limit; i++)
            System.out.print(i + ", ");

        System.out.println();

        for (int i = 1; i <= limit; i++)
            if (i % 2 == 0)
                System.out.print(i + ", ");
            else
                System.out.print("[], ");
    }
}
