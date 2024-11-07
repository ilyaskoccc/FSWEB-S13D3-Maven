package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double size;
    String eyeColor;
    String hairColor;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double size, String eyeColor, String hairColor) {
        this(firstName, lastName, age);
        this.size = size;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public int getAge () {
        return age;
    }

    public boolean isTeen () {
        return age >= 13 && age <= 19;
    }
}
