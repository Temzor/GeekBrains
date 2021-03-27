package com.geekbrains.lesson1;

import com.geekbrains.lesson1.animals.Animal;
import com.geekbrains.lesson1.animals.Cat;
import com.geekbrains.lesson1.animals.Dog;

import java.util.Date;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "White", 2);
        Cat cat2 = new Cat("Murzik", "Black", 4);
        Dog dog = new Dog("Bobik", "White", 2);

        cat.info();
        cat2.info();

        dog.voice();
        cat.voice();

        Animal cat3 = new Cat("A", "B", 1);
        if (cat3 instanceof Cat) {
            ((Cat) cat3).catMethod();
        } else {
            System.out.println("не кот");
        }

    }
}
