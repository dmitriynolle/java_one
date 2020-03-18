package ru.geekbrains.java_one;

import java.util.Random;

public class Horse extends Animal {
    private static final Random RANDOM = new Random();
    private static final int maxDistance = 1000 + RANDOM.nextInt(1000);
    private static final double maxHeight = RANDOM.nextDouble() * 10;
    private static final int maxSwim = 80 + RANDOM.nextInt(40);

    public Horse (String name, String color, int age) {
        super(name, color, age);
        this.distance = maxDistance;
        this.height = maxHeight;
    }

    public String swim(int swim) {
        if (swim <= maxSwim)
            return "Лошадь доплыла";
        else
            return "Лошадь утонула";
    }
}
