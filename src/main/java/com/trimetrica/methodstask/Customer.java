package com.trimetrica.methodstask;

public class Customer {
    private String name, email;
    private int age;

    public Customer(String name, String email, int age) {
        this.name = name;
        this.email = email;
        if (age >= 18 && age <= 122) {
            this.age = age;
        } else {
            System.out.println("Age must be between 18 and 110");
        }
    }

    public Customer() {
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 122) {
            this.age = age;
        } else {
            System.out.println("Age must be between 18 and 110");
        }
    }
    public int getAge() {
        return age;
    }

    public String getTheObjectInformation(){
        return "The name of customer is [" + name + "] with email [" + email + "] and age [" + age + "]";
    }
}
