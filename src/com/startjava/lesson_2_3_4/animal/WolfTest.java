package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf makkenaWolf = new Wolf();
        makkenaWolf.setMale("Самец");
        makkenaWolf.setNickname("Маккена");
        makkenaWolf.setColor("Серый");
        makkenaWolf.setWeight(4);
        makkenaWolf.setAge(7);

        System.out.println("Пол: " + makkenaWolf.getMale());
        System.out.println("Кличка: " + makkenaWolf.getNickname());
        System.out.println("Цвет: " + makkenaWolf.getColor());
        System.out.println("Вес: " + makkenaWolf.getWeight() + " кг");
        System.out.println("Возраст: " + makkenaWolf.getAge() + " лет\n");

        makkenaWolf.walk();
        makkenaWolf.sit();
        makkenaWolf.run();
        makkenaWolf.howl();
        makkenaWolf.hunt();
    }
}