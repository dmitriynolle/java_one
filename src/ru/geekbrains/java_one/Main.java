package ru.geekbrains.java_one;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Tuzik", "White", 5);
        Cat cat1 = new Cat("Murzik", "Grey", 4);
        Bird bird1 = new Bird("Chijik", "Yellow", 2);
        Horse horse1 = new Horse("Plotva", "Brown", 7);

        if (dog1.run(450))
            System.out.println("Пёс пробежал");
        else
            System.out.println("Пес устал");

        if (cat1.run(300))
            System.out.println("Кот пробежал");
        else
            System.out.println("Кот устал");

        if (bird1.jump(0.5))
            System.out.println("Птица допрыгнула");
        else
            System.out.println("Птица не допрыгнула");

        if (horse1.jump(2.8))
            System.out.println("Лошадь допрыгнула");
        else
            System.out.println("Лошадь не допрыгнула");

        System.out.println(bird1.swim(15));
        System.out.println(horse1.swim(70));
    }
}