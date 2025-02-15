package com.trimetrica.methodstask;

public class ExecutionService {
    public static void main(String[] args) {
    Customer customer001 = new Customer();
    customer001.setName("Gabi");
    customer001.setEmail("gabi001@gmail.com");
    customer001.setAge(DataGeneratorUtil.getRandomNumber(18,100));

    System.out.println(customer001.getTheObjectInformation());

    Customer customer002 = new Customer("Vuasea", "vasika@mail.ru", DataGeneratorUtil.getRandomNumber(18,100));
    System.out.println(customer002.getTheObjectInformation());

    System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));
    System.out.println(DataGeneratorUtil.getRandomEmail("john", "gmail.com"));
    }
}
