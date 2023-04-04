public class WolfTest {

    public static void main(String[] args) {
        //Wolf makkenaWolf = new Wolf("Самец", "Маккена", "Серый", 30, 18);
        Wolf makkenaWolf = new Wolf();
        makkenaWolf.male = "Самец";
        makkenaWolf.nickname = "Маккена";
        makkenaWolf.color = "Серый";
        makkenaWolf.weight = 30;
        makkenaWolf.age = 18;

        System.out.println("Пол: " + makkenaWolf.male);
        System.out.println("Кличка: " + makkenaWolf.nickname);
        System.out.println("Цвет: " + makkenaWolf.color);
        System.out.println("Вес: " + makkenaWolf.weight + " кг");
        System.out.println("Возраст: " + makkenaWolf.age + " лет\n");

        makkenaWolf.walking();
        makkenaWolf.sitting();
        makkenaWolf.running();
        makkenaWolf.howls();
        makkenaWolf.hunting();
    }
}