package ru.geekbrains.java_one;

public class Main {

    public static void main(String[] args) {

        Staff staff = new Staff("Dmitriy", "Boss", 300000, 1978);
        System.out.println("Name: " + staff.getName() + " | Post: " + staff.getPost());

        Staff[] arr = {
                new Staff("Vladimir", "Engener", 100000, 1980),
                new Staff("Ivan", "Engener", 90000, 1973),
                new Staff("Alexandr", "Engener", 70000, 1987),
                new Staff("Sergey", "Engener", 110000, 1971),
                new Staff("Denis", "Engener", 50000, 1979),
        };

        for (int x = 0; x < arr.length; x++) {
            if (arr[x].getAge() > 40)
                System.out.println(arr[x].getNumber() + " Name: " + arr[x].getName() + " | Post: " + arr[x].getPost() + " | Salary: "
                        + arr[x].getSalary() + " | Age:" + arr[x].getAge());
        }
        for (int x = 0; x < arr.length; x++) {
            staffIncrement (arr[x]);
            System.out.println(arr[x].getNumber() + " Name: " + arr[x].getName() + " | Post: " + arr[x].getPost() + " | Salary: "
                    + arr[x].getSalary() + " | Age:" + arr[x].getAge());
        }

        System.out.println(average (arr, "salary"));

        System.out.println(average (arr, "age"));

    }

    private static int average(Staff[] arr, String select) {
        int average = 0;
        for (int i = 0; i < arr.length; i++) {
            if (select == "age") average = average + arr[i].getAge();
            else average = average + arr[i].getSalary();
        }
        return average/arr.length;
    }

    private static void staffIncrement(Staff staff) {
        if (staff.getAge() > 45) staff.setSalary(staff.getSalary() + 5000);
    }
}