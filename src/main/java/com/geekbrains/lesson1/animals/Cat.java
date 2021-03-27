package com.geekbrains.lesson1.animals;

import com.geekbrains.lesson1.animals.Animal;

public class Cat extends Animal {
    int clawsLength;

    public Cat(String name, String color, int age, int clawsLength) {
        super(name, color, age);
        this.clawsLength = clawsLength;
    }

    public Cat(String barsik, String white, int age) {
    }
}
