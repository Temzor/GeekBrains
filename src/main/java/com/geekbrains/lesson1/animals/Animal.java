package com.geekbrains.lesson1.animals;

public class Animal {
    String name;
    String color;
    int age;

    public Animal() {
        this.name = "Unknown";
        this.color = "Unknown";
        this.age = 1;

    }

    public Animal(String name) {
        this.name = name;
        this.color = "Unknown";
        this.age = 1;

    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

    }

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public void voice() {
        System.out.println(name + " voice");
    }
}