package com.trimetrica.accessmodifiers.peopleevidence;

public class Person {

    public static boolean isHuman;

    public String firstName;

    protected String lastName;

    public final int ID;

    private int age;

    public boolean isRetried;

    public Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = id;
    }

    public Person(String firstName, String lastName, int id, int age, boolean isRetried) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = id;
        this.setAge(age);
        this.isRetried = isRetried;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100)
            this.age = age;
        else
            System.out.println("Entered age not valid!");
    }

    public int getAge() {
        return this.age;
    }

    public void printRetirmentStatus() {
        if (this.isRetried)
            System.out.println(this.firstName + " e pensioner");
        else
            System.out.println(this.firstName + " nu e pensioner");
    }
}
