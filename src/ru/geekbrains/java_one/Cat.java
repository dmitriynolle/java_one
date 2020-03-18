package ru.geekbrains.java_one;

import java.util.Random;

public class Cat extends Animal {
    private static final Random RANDOM = new Random();
    private static final int maxDistance = 150 + RANDOM.nextInt(100);
    private static final double maxHeight = 1 + RANDOM.nextDouble() * 2;

    public Cat(String name, String color, int age) {
        super(name, color, age);
        this.distance = maxDistance;
        this.height = maxHeight;
    }

    public String swim(int swim) {
        return "Кошка не плавает";
    }
}
