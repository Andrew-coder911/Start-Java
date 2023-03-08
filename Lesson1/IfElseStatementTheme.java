public class IfElseStatementTheme{

    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");
        int age = 31;
        if(age > 20){
            System.out.println("Тебе больше 20!");
        }else{
            System.out.println("Тебе меньше 20!");
        }

        boolean male = true;
        if (!male) {
            System.out.println("Ты женщина!");
        }else{
            System.out.println("Ты мужчина!");
        }

        float height = 1.83f;
        if (height < 1.80f) {
            System.out.println("Ты не высок.");
        }else{
            System.out.println("Ты достаточно высокий.");
        }

        String nameFirstLetter = "Andrew";
        if(nameFirstLetter.charAt(0) == 'M'){
            System.out.println("Ты не Андрей");
        }else if(nameFirstLetter.charAt(0) == 'I'){
            System.out.println("Все еще не Андрей");
        }else{
            System.out.println("Возможно что тебя зовут Андрей)\n");
        }

        System.out.println("2.Поиск max и min числа");
        int numOne = 70;
        int numTwo = 70;
        System.out.printf("Первое число - %d \nВторое число - %d\n", numOne, numTwo);
        if (numOne > numTwo) {
            System.out.printf("Число %d - max\n", numOne);
            System.out.printf("Число %d - min\n", numTwo);
        }else if (numOne < numTwo) {
            System.out.printf("Число %d - min\n", numOne);
            System.out.printf("Число %d - max\n", numTwo);
        }else{
            /System.out.println("Оба числа равны");
        }
    }
}