package com.geekbrains.lesson1.animals;

import com.geekbrains.lesson1.animals.Animal;

public class Cat extends Animal {
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println(name + " meow");
    }

    public void catMethod() {
        System.out.println("catMethod");
    }
}
