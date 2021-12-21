package ksu.mis;

public class Staff {
    String position;
    String name;
    int age;
    int rate; // базовая ставка в час
    long salary;
    int experience; // считаются только полные отработанные года
    int employment; // колличество часов в неделю

    Staff(String position, String name, int age, int rate, int experience, int employment) {
        this.position = position;
        this.name = name;
        this.age = age;
        this.rate = rate;
        this.experience = experience;
        this.employment = employment;
    }

    void salaryPosition() {
        if (experience < 3) {
            salary = (long) rate * employment;
        } else if (experience < 5) {
            salary = (long) rate * employment / 100 * 120;
        } else {
            salary = (long) rate * employment / 100 * 150;
        }
        System.out.println(salary);
    }

    void agePosition() {
        if (age < 18) {
            System.out.println(name + " рано работать");
        } else if (age > 65) {
            System.out.println(name + " пора на пенсию");
        }
    }
}