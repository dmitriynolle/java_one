package ru.geekbrains.java_one;

import java.util.Random;

public class Bird extends Animal {
    private static final Random RANDOM = new Random();
    private static final int maxDistance = 3 + RANDOM.nextInt(4);
    private static final double maxHeight = RANDOM.nextDouble();

    public Bird (String name, String color, int age) {
        super(name, color, age);
        this.distance = maxDistance;
        this.height = maxHeight;
    }

    public String swim(int swim) {
        return "Птица не плавает";
    }
}
