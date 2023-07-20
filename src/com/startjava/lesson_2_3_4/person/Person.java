package com.startjava.lesson_2_3_4.person;

public class Person {
    String male = "Мужской";
    String name = "Андрей";
    int height = 183;
    int weight = 74;
    int age = 31;
    int speed = 5;

    //как правильно менять скорость объекта?
    public void run(int speed) {
        speed = 8;
    }
    //тут поменяется скорость объекта?
    public void walk(int speed) {
        this.speed = 5;
    }
    //Или так?
    public void stay() {
        this.speed = 0;
    }

    public void say() {
        System.out.println("Что-то сказал");
    }
}