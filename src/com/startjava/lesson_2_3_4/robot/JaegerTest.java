package com.startjava.lesson_2_3_4.robot;

class JaegerTest {

    public static void main(String[] args) {
        Jaeger strikerEureka = new Jaeger("Striker Eureka", 10, 9, "Assault Mount 3.25");
        Jaeger cayoteTango = new Jaeger();
        cayoteTango.setName("Cayote Tango");
        cayoteTango.setStrenght(7);
        cayoteTango.setArmor(4);
        cayoteTango.setWeapon("Ballistic mortar cannons");

        System.out.println("Первый робот:");
        strikerEureka.getName();
        strikerEureka.printStats();
        System.out.println("Второй робот:");
        cayoteTango.getName();
        cayoteTango.printStats();
    }
}