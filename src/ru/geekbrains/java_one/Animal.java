package ru.geekbrains.java_one;

public abstract class Animal {

    protected String name;
    protected String color;
    protected int age;
    protected int distance;
    protected double height;

    public Animal (String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public boolean run(int distance) {
        return this.distance >= distance;
    }

    public boolean jump(double height) {
        return this.height >= height;
    }

    public abstract String swim(int swim);
}
