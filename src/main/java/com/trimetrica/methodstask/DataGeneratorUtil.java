package com.trimetrica.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {
    static Random random = new Random();

    public static int getRandomNumber(int startLimit, int endLimit) {
        int delta = endLimit - startLimit;
        int deltaRandomNum = random.nextInt(delta);
        return startLimit + deltaRandomNum;
    }

    public static int getRandomNumber(int limit) {
        return random.nextInt(limit);
    }

    public static String getRandomEmail(String emailDomain){
        return UUID.randomUUID().toString() + "@" + emailDomain;
    }

    public static String getRandomEmail(String prefix, String emailDomain){
        return prefix + getRandomNumber(99999999) + "@" + emailDomain;
    }
}
