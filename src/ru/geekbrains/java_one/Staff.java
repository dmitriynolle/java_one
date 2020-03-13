package ru.geekbrains.java_one;

public class Staff {
    private static int count = 0;
    private final int year = 2020;
    private int number;
    private String name;
    private String post;
    private int salary;
    private final int birthDate;

    Staff (String name, String post, int salary, int birthDate) {
        this.number = count++;
        this.name = name;
        this.post = post;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return year - birthDate;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
