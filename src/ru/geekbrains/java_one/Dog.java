package ru.geekbrains.java_one;

import java.util.Random;

public class Dog extends Animal {
    private static final Random RANDOM = new Random();
    private static final int maxDistance = 400 + RANDOM.nextInt(200);
    private static final double maxHeight =  RANDOM.nextDouble();
    private static final int maxSwim =  7 + RANDOM.nextInt(6);
    private int swim;

    public Dog (String name, String color, int age){
        super(name, color, age);
        this.distance = maxDistance;
        this.height = maxHeight;
    }

    public String swim(int swim) {
        if (swim <= maxSwim)
            return "Собака доплыла";
        else
            return "Собака утонула";
    }
}
